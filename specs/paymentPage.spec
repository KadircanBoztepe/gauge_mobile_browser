Payment Page Test Scenario
===========================


Default olarak anasayfadan başlayan test için verilen link için sayfanın doğru açılması kontrol ediliyor.
The page is verified to open.
-------------------------------------------
*Go to HomePage
*"Homepage İcon" display element.
*Go to "https://meditopia.app/int/FuoEFN3QDgLo06lrOhySuWubL5IbbO4f/" URL
*"User Details Text" display element.
*The text of the "User Details Text" element matches "Start Meditopia Premium for free!".
*"Logo" display element.

Ödeme ekranında bulunan tüm label, input, text, dropdown ve ikonların sayfadaki görünürlüğü ve textlerin doğruluğu kontrol ediliyor.
Checking fields on the page
-------------------------------------------
*Go to HomePage
*"Homepage İcon" display element.
*Go to "https://meditopia.app/int/FuoEFN3QDgLo06lrOhySuWubL5IbbO4f/" URL
*"User Details Text" display element.
*The text of the "User Details Text" element matches "Start Meditopia Premium for free!".
*"User Details Text Hi" display element.
*The text of the "User Details Text Hi" element matches "Hi,".
*Scroll to "Cardholder Name Label".
*The text of the "Cardholder Name Label" element matches "CARDHOLDER NAME".
*"Credit Card Number Label" display element.
*The text of the "Credit Card Number Label" element matches "CREDIT CARD NUMBER".
*"Date Of Expire Label" display element.
*The text of the "Date Of Expire Label" element matches "DATE OF EXPIRE".
*"Cardholder Name Input" display element.
*"Credit Card Number Input" display element.
*"Month Dropdown" click element.
*"Month Dropdown List" The dropdown is verified.
*"Year Dropdown" click element.
*"Year Dropdown List" The dropdown is verified.
*"CVV Label" display element.
*The text of the "CVV Label" element matches "CVV".
*"Start Now Button" display element.
*The text of the "Start Now Button" element matches "START NOW".
*"Terms Label" display element.
*Scroll to "Terms Label".
*The text of the "Terms Label" element matches "First 14 days for free after then continue $59,99 per year Cancel anytime on meditopia.com".
*"Secure Bar SSL" display element.
*"Secure Bar MasterCard" display element.
*"Secure Bar Visa" display element.
*"Footer Terms and Conditions" display element.
*The text of the "Footer Terms and Conditions" element matches "Terms & Conditions".
*"Footer Privacy Policy" display element.
*The text of the "Footer Privacy Policy" element matches "Privacy Policy".
*"Footer Support" display element.
*The text of the "Footer Support" element matches "Support".

Sayfa üzerinde bulunan hata mesajları kontrol ediliyor.
Assert validation message control Test
---------------------------------------------------
*Go to HomePage
*"Homepage İcon" display element.
*Go to "https://meditopia.app/int/FuoEFN3QDgLo06lrOhySuWubL5IbbO4f/" URL
*"User Details Text" display element.
*"Cardholder Name Input" click element.
*"Start Now Button" click element.
*Error message "Please fill out this field." appears in "Cardholder Name Input" element.
*Send keys "KADİR" in "Cardholder Name Input".
*"Start Now Button" click element.
*Error message "Please fill out this field." appears in "Credit Card Number Input" element.
*Send keys "123" in "Credit Card Number Input".
*"Start Now Button" click element.
*Error message "Please select an item in the list." appears in "Month Dropdown" element.
*"Month Dropdown" click element.
*"Month Dropdown List" Dropdown random number is selected.
*"Start Now Button" click element.
*Error message "Please select an item in the list." appears in "Year Dropdown" element.
*"Year Dropdown" click element.
*"Year Dropdown List" Dropdown random number is selected.
*"Start Now Button" click element.
*Error message "Please fill out this field." appears in "CVV Input" element.
*Send keys "123" in "CVV Input".
*"Start Now Button" click element.
*"Payment Fail" display element.
*The text of the "Payment Fail" element matches "Your payment was unsuccessful. Check your payment details and retry.!".
*Stop the test for "2" seconds.


Tüm alanlar doğru doldurularak başarılı ödeme testi yapılıyor.
Successful payment test
-------------------------------------------------------------
*Go to HomePage
*"Homepage İcon" display element.
*Go to "https://meditopia.app/int/FuoEFN3QDgLo06lrOhySuWubL5IbbO4f/" URL
*"User Details Text" display element.
*Scroll to "Cardholder Name Input".
*"Cardholder Name Input" click element.
*"Credit Card Number Input" click element.
*"Cardholder Name Input" click element.
*Stop the test for "2" seconds.
*Send keys number "Kadir" in "Cardholder Name Input".
*"Credit Card Number Input" click element.
*Stop the test for "1" seconds.
*Send keys number "4242444444444443" in "Credit Card Number Input".
*"Credit Cart Visa İcon" display element.
*"Credit Card Number Label" click element.
*Stop the test for "1" seconds.
*"Month Dropdown" click element.
*"Month Dropdown List" Dropdown random number is selected.
*"Year Dropdown" click element.
*"Year Dropdown List" Dropdown random number is selected.
*"CVV Input" click element.
*Send keys number "123" in "CVV Input".
*"Start Now Button" click element.
*"Congratulations İcon" display element.
*The text of the "Congratulations Text" element matches "CONGRATULATIONS!".
*Stop the test for "2" seconds.













