  Feature: GetLand Test
    Scenario: Kullanıcı Admin rolünde sayfayı İngilzce görüntüleyebilmelidir.
    Given Kullanici "http://www.getlandestate.com/" sites gider
    When sayfada login kısmına tıklanır
    Then Admin E-Postası girilir
    But Admin Şifre girilir ve sayfaya giriş yapılır
    And sayfayi kapatir

