# wsdl-to-stub: Given the WSDL Invoke SOAP Web Service Thru Java Code

# 1. Generate stub through maven build (pom.xml)
	- Use Maven, make entry in POM to generate soruce from WSDL

# 2. Generate stub through wsimport (Comes with JavaSE)
	- wsimport http://www.webservicex.net/geoipservice.asmx?WSDL

# Which Class to use as a Stub: Look into wsdl
	- Look into wsdl
	- Look at wsdl:service/wsdl:port element, This declared the PortType
		wsdl:service / name ~ Java Class having service
	- Goto <wsdl:portType> element: Analogy
		wsdl:portType / name ~ Java Interface Name
		wsdl:operation / name ~ Java Method Name
			wsdl:input : Input to method
			wsdl:output : Output of method
			


