<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Adhoc">
 <listeners>

		<listener class-name="listners.listnerui" />

	</listeners>

<parameter name="url"     value="https://www.homedepot.com/"></parameter>
<test  name="Home">
<parameter name="browser" value="chrome"></parameter>
<classes>
<class name="Runer.HomeDepotTest"></class>

</classes>
</test>
<test  name="firefox">
<parameter name="browser" value="firefox"></parameter>
<classes>
<class name="Runer.HomeDepotTest"></class>

</classes>
</test>

</suite>