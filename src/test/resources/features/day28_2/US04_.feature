@Us04

  Feature: US03 Amazon Testi
    Background:
      Given kullanici "https://amazon.com" sayfasina gider
      @iphone
      Scenario: TC01 arama kutusunda iphone aratilir
        When arama kutusunda "iphone" aratir
      When arama kutusunda "iphone" aratir

