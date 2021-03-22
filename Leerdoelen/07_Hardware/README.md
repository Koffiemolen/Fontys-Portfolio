# Introductie

Voor dit onderdeel is heb ik een test opstelling gemaakt om een beter begrip te krijgen over hoe hardware in elkaar zit. Wat komt er allemaal bij kijken en hoe haal en schrijf je data naar hardware componenten. 

Een goed beeld te krijgen wat er allemaal bij komt kijken heb ik ervoor gekozen om naast een temperatuursensor een oled scherm aan te sluiten.
Om ook inzicht te kijgen in hoe je deze data(temperatuur) nu kan versturen naar bijvoorbeeld een MQTT broker of dat je deze beschikbaar stelt via een API, heb ik besloten om dit ook beschikbaar te maken in de firmware.

# Inhoudsopgave
- Wat, waarom, hoe?
- Hardware
- Code

# Wat, waarom, hoe?
Om goed weer te kunnen geven wat ik allemaal gedaan heb, welke stappen ik heb doorlopen en welke keuzes ik gemaakt heb. Zal ik antwoord geven op de vragen wat, waarom en hoe.

## Wat
Het doel is om aan te tonen hoe je een sensor uit kan lezen en deze data, beschikbaar kan stellen. Om mijzelf uit te dagen heb ik ervoor gekozen om nog een OLED scherm toe te voegen en de data beschikbaar te stellen via een API en te versturen naar een MQTT broker. Deze technieken kunnen van pas komen voor het groepsproject.

Zowel het OLEd scherm als de sensor communiceren via het I2C protocol. [I²C - Wikipedia](https://en.wikipedia.org/wiki/I%C2%B2C)

Kort samengevat, het programmeren van een microcontroller, zodat deze een sensor uitleest en de data als een object aanbiedt. Dit gebeurt via een API en naar een MQTT broker.



## Waarom
Om een goed gevoel en een beter inzicht te krijgen wat er nu voor nodig is om een sensor uit te lezen en deze data beschikbaar te stellen in een lees- en handelbaar formaat. En deze data via bepaalde protocollen beschikbaar te stellen zodat deze als input gebruikt kan worden door andere processen/services.



## Hoe
Voor mijn proof of concept heb ik de onderstaande situatie nagebouwd.
![Default sketch](img/07_hardware/Beer.cool.board_bb.png)
![Default sketch](./img/07_hardware/Beer.cool.board_bb.png)
De eerste uitdaging was 
