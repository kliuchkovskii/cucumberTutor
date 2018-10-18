Feature: account creation

@RegressionTest
Scenario Outline: Verifying different user data for registration
    Given I am on Facebook registration page with title "Facebook — увійдіть або зареєструйтеся"
    When I enter name as "<name>" and lastname as "<lastname>"
    And I enter email or tel as "<emailOrTel>" and password as "<password>"
    And I enter DoB as "<DoB>" and SEX as "<SEX>"
    And I click registration button
    Then I should see "<status>"

Examples:
|name|lastname|emailOrTel|password|DoB|SEX|status|
|Mykola|Key|hello|SOmePAssword123|27/12/1993|male|fail|
|Mykola|Key|example@example.com|SOmePAssword123|27/12/1993|male|Success|
|Mykola|Key|example2@example.com|SOmePAssword123|27/12/2018|female|fail|
|TEST|TEST|example3@example.com|SOmePAssword123|27/12/1993|female|fail|
|Mykola|Key|example@example.com|SOmePAssword123|27/12/1993|male|fail|
| |Key|example@example.com|SOmePAssword123|27/12/1993|male|Як вас звати?|
|Mykola| |example@example.com|SOmePAssword123|27/12/1993|male|Як вас звати?|
|Mykola|Key| |SOmePAssword123|27/12/1993|male|Ці дані знадобляться для входу та скидання пароля (за потреби).|
|Mykola|Key|example@example.com| |27/12/1993|male|Введіть комбінацію із принаймні шести цифр, букв і знаків пунктуації (наприклад, ! та &).|
|Mykola|Key|example@example.com|SOmePAssword123|27/12/1993| |Укажіть стать. Пізніше можна змінити, хто може це бачити.|
