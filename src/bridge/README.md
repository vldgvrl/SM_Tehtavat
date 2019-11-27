# Ohjelman kautta voidaan hallita tietokonepalveluita.

## Ohjelman käyttävä abstraktio on ComputerServise luokka ja sen alitoteutuksia: Programm, Specialist tai joku muu palvelu.
Aliluokan metodia voi olla esimerkiksi: antaa palvelu 'provideService()', saada maksu 'getPay()'.

## ServiceOperations API-rajapinta on toteutusalue. Tästä voi määritää eri IT-palveluiden toiminnot niin kuin toteuttaa 'build()' ja suorittaa 'execute()'.

## Front puolelta märitellään mitkä palveluita toteutetaan, mitkä ovat jo toteutettu ja mitkä on myyty.
