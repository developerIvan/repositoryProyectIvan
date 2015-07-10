 <%@ include file="/WEB-INF/views/libraries.jsp"  %>
 <c:url value="/AllDrinks" var="allDrinks" />
 <header id="site-header">
 
  <c:set value="" var="context" />
 <img id="image1" src="resources/images/restauranteImgBanner.jpg"  width="1500px" height="400px" alt=""/>
	     
	       
		   	<nav class="nav-menu">
					<ul class>
					<li ><a href="#">Platos</a>
					</li>
					<li ><a href="#">Combos</a>
					</li>
					<li ><a href="${allDrinks}">Bebidas</a>
					</li>
					<li ><a href="#">Mesas disponibles</a>
					</li>
					<li ><a href="#">Acerca de:</a>
					</li>
				  </ul>
			</nav>
</header>