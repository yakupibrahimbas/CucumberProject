@US006
Feature: US006 Google Testi

  Scenario Outline: TC01 Google sayfasinda arama kutusunda arac aratilir

    Given kullanici "https://google.com" sayfasina gider
    When google arama kutusunda "<araclar>" aratir
    Then sayfa basliginin "<araclar>" icerdigini test eder
    But kullanici 2 saniye bekler
    And sayfayi kapatir
    Examples:
      | araclar|
      | volvo|
      | ford|
      | toyota|



