 <%@ include file="/WEB-INF/views/libraries.jsp"  %>



  <c:if test="${null!= drinksType}">
      
      <c:forEach items="${drinksType}" var="drinkType" >
         <section>
        
            <h2><c:out value="${drinkType.beverageType}"></c:out> </h2>  
              <c:if test="${null!=drinksMap}">
               <section>
	             <c:if test="${null!=drinksMap[drinkType.idDrinkType]}">
	                 <c:forEach items="${drinksMap[drinkType.idDrinkType]}" var="drink" >
	                
		              <article class="sectionClass">
		                  <header>
		                     
		                    <h3>${drink.drink}</h3>
		                  </header>
		                  <img id="image" src="${drink.imageUrl}"  width="450px"; height="250px"; alt=""/>
		                  <h4>Precio: $ ${drink.drinkPrice }</h4>
		              </article>
		             </c:forEach>   
	              </c:if>
	              </section>
               </c:if>    
         </section>
        
         
      </c:forEach>
        
  </c:if> 






