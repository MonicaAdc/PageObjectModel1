<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd" >
<suite name="Suite1" >
    <test name="123" >
        <classes>
            <class name="tests.LoginTest" >
            	<methods>
            		<exclude name = "validLoginTest"/>
            	</methods>
            </class>
        </classes>
    </test>
</suite>