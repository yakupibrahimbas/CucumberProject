@US3
Feature: US03 Amazon Testi
  Background:
    Given kullanici amazon sayfasina gider

  Scenario: TC01 arama kutusunda iphone aratilir

    When arama kutusunda "iphone" aratir
    And sayfayi kapatir

    Scenario: TC02 arama kutusunda samsung aratilir

      When arama kutusunda "Samsung" aratir
      And sayfayi kapatir

      Scenario: TC03 arama kutusunda nokia aratilir

        When arama kutusunda "Nokia" aratir
        And sayfayi kapatir