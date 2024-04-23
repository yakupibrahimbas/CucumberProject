#TASK:
# 3 tane Scenario oluşturunuz
# Amazon sayfasında iphone, samsung ve nokia aratınız.
@US003
Feature: US003 Amazon Testi

  Background:
    Given kullanici amazon sayfasina gider

  @iphone @smoke
  Scenario: TC01 Arama kutusunda iphone aratilir
    When arama kutusunda iphone aratir
    And sayfayi kapatir

  @samsung @smoke @toprak
  Scenario: TC02 Arama kutusunda samsung aratilir
    When arama kutusunda samsung aratir
    And sayfayi kapatir

  @nokia
  Scenario: TC03 Arama kutusunda nokia aratilir
    When arama kutusunda nokia aratir
    And sayfayi kapatir

    #  Feature file de kullanacagimiz scenariolarda baslangic icin ortak adimlar var ise
#  Background keywordu kullanarak ortak adimlari belirtebiliriz, @BeforeEach mantigi ile calisir