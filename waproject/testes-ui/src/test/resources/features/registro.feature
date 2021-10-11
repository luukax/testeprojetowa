#Author: lucasarthurpaifilho@lucasarthurpaifilho.gmail.com


Feature: Pesquisar registros
  Como teste Quero pesquisar registro inserido Para validar o processo

  Scenario: Pesquisar registro inserido
    Given que esteja no "https://hml-wa-timesheet.waproject.com.br"
    And preencho o formulario de login 
    And acesse Conferirmeus registros de horas
    When valido insercao no registro de atividade 
    

