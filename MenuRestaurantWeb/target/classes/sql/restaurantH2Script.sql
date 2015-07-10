




DROP TABLE IF EXISTS `cajero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cajero` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cedula` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ;


--
-- Table structure for table `promocion`
--

DROP TABLE IF EXISTS `promocion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `promocion` (
  `code` varchar(255) NOT NULL,
  `promoId` int(11) NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `dish` tinyblob,
  `drink` tinyblob,
  `fechaVencimiento` date DEFAULT NULL,
  `promocionVencida` bit(1) DEFAULT NULL,
  `porcentaje` float NOT NULL,
  PRIMARY KEY (`code`,`promoId`)
);






--
-- Table structure for table `restaurante`
--

DROP TABLE IF EXISTS `restaurante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `restaurante` (
  `idRestaurante` int(11) NOT NULL AUTO_INCREMENT,
  `cedulaJuridica` varchar(255) NOT NULL,
  `telefono` varchar(255) NOT NULL,
  `nombreRestaurante` varchar(255) NOT NULL,
  PRIMARY KEY (`idRestaurante`)
);



--
-- Table structure for table `mesa`
--

DROP TABLE IF EXISTS `mesa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `mesa` (
  `idMesa` int(11) NOT NULL AUTO_INCREMENT,
  `numeroDeMesa` int(11) NOT NULL,
  `restaurant` int(11) DEFAULT NULL,
  PRIMARY KEY (`idMesa`),
  FOREIGN KEY (`restaurant`) REFERENCES `restaurante` (`idRestaurante`)
);

--
-- Table structure for table `tipobebida`
--

DROP TABLE IF EXISTS `tipobebida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipobebida` (
  `idTipoBebida` int(11) NOT NULL AUTO_INCREMENT,
  `tipoDeBebida` varchar(255) NOT NULL,
  `codigoTipoBebida` varchar(255) NOT NULL,
  PRIMARY KEY (`idTipoBebida`),
  UNIQUE KEY `codigoTipoBebida` (`codigoTipoBebida`)
);


DROP TABLE IF EXISTS `bebida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bebida` (
  `idBebida` int(11) NOT NULL AUTO_INCREMENT,
  `bebida` varchar(255) NOT NULL,
  `codigoBebida` int(11) NOT NULL,
  `tipoDeBebida` int(11),
  `imagenUrl` varchar(100),
  `precioBebida` NUMERIC(20, 2),
  
  PRIMARY KEY (`idBebida`),
   FOREIGN KEY (`tipoDeBebida`) REFERENCES `tipobebida` (`idTipoBebida`)
) ;

--
-- Table structure for table `tipodeorden`
--

DROP TABLE IF EXISTS `tipodeorden`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipodeorden` (
  `idTipo` int(11) NOT NULL,
  `costes` double DEFAULT NULL,
  `tipoDeOrden` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idTipo`)
);


--
-- Table structure for table `tipodepago`
--

DROP TABLE IF EXISTS `tipodepago`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipodepago` (
  `codigoTipoDePago` varchar(255) NOT NULL,
  `amount` double DEFAULT NULL,
  `paymentType` varchar(255) NOT NULL,
  PRIMARY KEY (`codigoTipoDePago`)
);


--
-- Table structure for table `tipodeplato`
--

DROP TABLE IF EXISTS `tipodeplato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tipodeplato` (
  `idTipo` int(11) NOT NULL AUTO_INCREMENT,
  `codigoTipoDePlato` varchar(255) NOT NULL,
  `tipoDePlato` varchar(255) NOT NULL,
  PRIMARY KEY (`idTipo`)
);


--
-- Table structure for table `plato`
--

DROP TABLE IF EXISTS `plato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `plato` (
  `idPlato` int(11) NOT NULL AUTO_INCREMENT,
  `nombrePlatillo` varchar(255) NOT NULL,
  `numeroPlatillo` int(11) NOT NULL,
  `tipoPlato` int(11),
  `precio` double NOT NULL,
  `imagenUrl` varchar(100),
  PRIMARY KEY (`idPlato`),
  FOREIGN KEY (`tipoPlato`) REFERENCES `TipoDePlato` (`idTipo`)
);

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `idCliente` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `identificacion` varchar(255) NOT NULL,
  `apellidos` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idCliente`),
  UNIQUE KEY `identificacion` (`identificacion`)
) ;

--
-- Table structure for table `orden`
--

DROP TABLE IF EXISTS `orden`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orden` (
  `idOrden` int(11) NOT NULL AUTO_INCREMENT,
  `customer` tinyblob,
  `descuento` double DEFAULT NULL,
  `precioBruto` double DEFAULT NULL,
  `vuelto` double DEFAULT NULL,
  `precioNeto` double DEFAULT NULL,
  `fechaOrden` datetime NOT NULL,
  `retaurant` tinyblob,
  `impuesto` double NOT NULL,
  `idCajero` int(11) DEFAULT NULL,
  `tipoDeOrden` int(11) DEFAULT NULL,
  `tipoDePago` varchar(255) DEFAULT NULL,
  `mesa` int(11) DEFAULT NULL,
  PRIMARY KEY (`idOrden`),
 FOREIGN KEY (`tipoDePago`) REFERENCES `tipodepago` (`codigoTipoDePago`),
   FOREIGN KEY (`idCajero`) REFERENCES `cajero` (`id`),
   FOREIGN KEY (`mesa`) REFERENCES `mesa` (`idMesa`),
 FOREIGN KEY (`tipoDeOrden`) REFERENCES `tipodeorden` (`idTipo`)
);

--
-- Table structure for table `detalleorden`
--

DROP TABLE IF EXISTS `detalleorden`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalleorden` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `precioDetalle` double DEFAULT NULL,
  `codigoPromocion` varchar(255) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `orden` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`orden`) REFERENCES `orden` (`idOrden`)
) ;


--
-- Table structure for table `detalleordenbebida`
--

DROP TABLE IF EXISTS `detalleordenbebida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalleordenbebida` (
  `idBebida` int(11) DEFAULT NULL,
  `idDetalleOrden` int(11) NOT NULL,
  PRIMARY KEY (`idDetalleOrden`),
  FOREIGN KEY (`idBebida`) REFERENCES `bebida` (`idBebida`),
  FOREIGN KEY (`idDetalleOrden`) REFERENCES `detalleorden` (`id`)
);


--
-- Table structure for table `detalleordenplato`
--

DROP TABLE IF EXISTS `detalleordenplato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detalleordenplato` (
  `idPlato` int(11) DEFAULT NULL,
  `idDetalleOrden` int(11) NOT NULL,
  PRIMARY KEY (`idDetalleOrden`),
  FOREIGN KEY (`idPlato`) REFERENCES `plato` (`idPlato`),
  FOREIGN KEY (`idDetalleOrden`) REFERENCES `detalleorden` (`id`)
);







