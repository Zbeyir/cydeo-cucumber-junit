package com.cydeo.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinitions {

//14. gün Gürhan ile birlik te yaptik

    @When("user enters librarian username")
    public void user_enters_librarian_username() {
        // Write code here that turns the phrase above into concrete actions
        // throw new io.cucumber.java.PendingException();
        /*
        bu yukarida kiler copy and paste yaptik ve oradan geldi , eger bunlari silmeden
        run edersek tek tekrar hata aliriz, onun icin silip kendi kodalrimizi giriyoruz

         */
        System.out.println("user enters librarian username");

    }

    @When("user enters librarian password")
    public void user_enters_librarian_password() {
        System.out.println("user enters librarian password");
    }

    @Then("user should see the dashboard")
    public void user_should_see_the_dashboard() {

        System.out.println("user should see the dashboard");
    }

    @When("user enters student username")
    public void userEntersStudentUsername() {
        System.out.println("user enters student username");
    }

    @And("user enters student password")
    public void userEntersStudentPassword() {
        System.out.println("user enters student password");
    }

    @When("user enters admin username")
    public void userEntersAdminUsername() {
        System.out.println("user enters admin username");
    }

    @And("user enters admin password")
    public void userEntersAdminPassword() {
        System.out.println("user enters admin password");
    }







/*Burayi degilde login.feature 'u ayni seyi kopyalayip yapistirdigimizda altina Scenario 'dan 2 tane
olacak ve hata vermiyacek
!!!ama;;; eger bu sayfayi kopy past yapip ayni seyi kullanmay kalkarsak tekra hata verecek
####---ve diger önmeli madde de de fotosunu cektim 14. güne git bak
----
###son 2 tane user student lari login.feature 'a gidip oradan sag tus yapip yaptik
ve bak görünüsleri farkli

 */

}
