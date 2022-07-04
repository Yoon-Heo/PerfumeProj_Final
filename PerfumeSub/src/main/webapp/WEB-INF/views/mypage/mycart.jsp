<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %> 
     

 <script src="https://code.jquery.com/jquery-3.6.0.js"></script> 
<!-- jQuery  -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

<style>
.mycart_del {
	border-color: #ff0065;
	text-decoration: none;
	color: #ff0065;
}

.input_size_20{
	width:20px;
	height:20px;
	}
</style> 
  
  
<main style="margin: 0 150px 100px 150px">
<div class="container">
<h3 style="margin:130px 0 40px 0; text-align:center">${member.user_name}님의 장바구니</h3>
<hr style="color:#555555">

<!-- 체크박스 전체 여부 -->
<div class="all_check_input_div">
	<input type="checkbox" class="all_check_input input_size_20" checked="checked">
	<span class="all_check_span">전체선택</span>
</div>


<!-- <h2>${cartInfo}</h2>  -->

<table class="table table-hover" >
   <tr class="active">
   	  <th>&nbsp;</th>
   	  <th>&nbsp;</th>   
      <th><p class="text-center">상&nbsp;품&nbsp;명</p></th>
      <th><p class="text-center">단&nbsp;가</p></th>
      <th><p class="text-center">수&nbsp;량</p></th>
      <th><p class="text-center">금&nbsp;액</p></th>
      <th>&nbsp;</th>
   </tr>
    
  	<c:forEach var="mycart" items="${myCartInfo}">
    <tr align="center">
		<!-- 스크립트를 통해 종합 정보 섹션(하단)에 담을 정보를 <input>으로 저장
			( + 선택 체크박스 추가) -->
		<td class="mycart_info_td">
			<input type="checkbox" class="individual_mycart_checkbox input_size_20" checked="checked">
			<input type="hidden" class="individual_price_input" value="${mycart.price }">
			<input type="hidden" class="individual_totalPrice_input" value="${mycart.price * mycart.product_count }">
			<input type="hidden" class="individual_count_input" value="${mycart.product_count }">
			<!-- 주문정보를 위한 상품id 추가 -->
			<input type="hidden" class="individual_prodid_input" value="${mycart.product_id}">
		</td>
		<!--/ ------------------------------------------------------- -->
		<td><img src="${mycart.image }" width=60px height="60px" align="left" /></td> 
		<td>${mycart.name }</td>
		<td><fmt:formatNumber value="${mycart.price }" pattern="#,###,### 원" /></td>
		<td>${mycart.product_count }</td>
		<td><fmt:formatNumber value="${mycart.price * mycart.product_count }" pattern="#,###,### 원" /></td>
		
		<td><button type="button" class="mycart_del" data-mycartid="${mycart.cart_id}">삭제</button></td>	
    </tr>
    </c:forEach>
</table>

<br><br>

<p> 상품가격 100,000원이상시 무료배송입니다.</p>

<table class="table table-striped" >
	<tr>
		<th><p class="text-center">총 상품수량</p></th>
		<th></th>
		<th>총 상품가격</th>
		<th></th>
		<th>배&nbsp;송&nbsp;비</th>
		<th></th>
		<th>최종 결제금액</th>
	</tr>
	
	<tr>
		<td align="center"><span class="totalCount_span"></span></td>
		<td><span class=""></span></td>
		<td><span class="totalPrice_span"></span><fmt:formatNumber value=""
                 pattern="#,###,### 원" />&nbsp;원</td>
		<td><span class="glyphicon glyphicon-plus"></span></td>
		<td><span class="delivery_price"></span>&nbsp;원</td>
		<td><span class="glyphicon glyphicon-arrow-right"></span></td>
		<td><span class="finalTotalPrice_span"></span>
					<fmt:formatNumber value="" pattern="#,###,### 원"/>&nbsp;원</td>
	</tr>
	
</table>
<div class="row">
<div class="col-4"></div>
<div class="col-4"></div>
<div class="col-4">
<p><button type="button" class="doOrder_btn" style="text-decoration: none; color: white; height:50px; width: 350px; 
background-color: black; font-size: 18px; font-weight: bold;">주문하기</button></p>
</div>
</div>

<!-- 목록 삭제 form -->
<form action="/mycart/delete" method="post" class="delete_form">
	<input type="hidden" name="cart_id" class="delete_myCartId">
	<input type="hidden" name="member_id" value="${member.id}">
</form>

<!-- 주문 form -->
<form action="/shoporder/${member.id}" method="get" class="order_form">

</form>


</div>

<!-- 주문 종합정보 JS -->
<script>
$(document).ready(function(){
	
	/* 하단 종합정보 섹션 삽입 */
	setTotalInfo();
	
});	

/* 체크여부에 따른 종합 정보 변화 */
$(".individual_mycart_checkbox").on("change", function(){

	/* 총 주문정보 세팅 */
	setTotalInfo($(".mycart_info_td"));
	
});

/* 체크박스 전체 선택 */
$(".all_check_input").on("click", function(){

	/* 체크박스 체크/해제 */
	if($(".all_check_input").prop("checked")){
		$(".individual_mycart_checkbox").attr("checked", true);
	} else{
		$(".individual_mycart_checkbox").attr("checked", false);
	}	
	
	/* 총 주문정보 세팅 (전체 목록에 등록/해제 반영) */
	setTotalInfo($(".mycart_info_td"));
	
});

/* 총 주문정보 세팅 */
function setTotalInfo(){
			
	let totalPrice = 0;
	let totalCount = 0;
	let finalTotalPrice = 0;
	let deliveryPrice = 0;
	
	$(".mycart_info_td").each(function(index, element){
		
		if($(element).find(".individual_mycart_checkbox").is(":checked") === true){  // 체크여부 검사
										
		// 총 가격
		totalPrice += parseInt($(element).find(".individual_totalPrice_input").val());
		
		// 총 수량
		totalCount += parseInt($(element).find(".individual_count_input").val());
		
		}
	});
	
	// 배송비 결정 : 주문금액 10만원 이상시 무료배송
	if(totalPrice >= 100000) {
		deliveryPrice = 0;				
	} else if(totalPrice == 0) {
		deliveryPrice = 0;
	} else {
		deliveryPrice = 3000;
	}
	
	// 최종 주문금액
	finalTotalPrice = totalPrice + deliveryPrice;
	
	/* 값 삽입 */
	// 총 가격 
	$(".totalPrice_span").text(totalPrice.toLocaleString());
	// 총 갯수
	$(".totalCount_span").text(totalCount);
	// 배송비
	$(".delivery_price").text(deliveryPrice);
	// 최종 금액 = (총 가격 + 배송비)
	$(".finalTotalPrice_span").text(finalTotalPrice);		
				
}  // End - function setTotalInfo()

/* 장바구니 삭제 동작 */
$(".mycart_del").on("click", function(e){
	e.preventDefault();		
	const cart_id = $(this).data("mycartid");
	$(".delete_myCartId").val(cart_id);
	$(".delete_form").submit();
	
});

/* 주문페이지 이동 */
$(".doOrder_btn").on("click", function(){
	
	let form_contents = '';
	// orders[0], orders[1], ...과 같이 index값 역할을 할 orderNumber 변수 선언(0초기화)
	let orderNumber = 0;
	//  상품의 데이터가 저장된 <input> 값들을 감싸고 있는 <td> 태그 반복해서 접근하는 메서드 추가
	$(".mycart_info_td").each(function(index, element){
		
		let product_id = $(element).find(".individual_prodid_input").val();	
		let product_count = $(element).find(".individual_count_input").val();	
		
		let product_id_input = "<input name='orders[" + orderNumber + "].product_id' type='hidden' value='" + product_id + "'>";
		form_contents += product_id_input;
		
		let product_count_input = "<input name='orders[" + orderNumber + "].product_count' type='hidden' value='" + product_count + "'>";
		form_contents += product_count_input;
		
		orderNumber += 1;
		
		
		
	});
	
	$(".order_form").html(form_contents);
	$(".order_form").submit();
	
	
});

</script>


</main>  
  
  
