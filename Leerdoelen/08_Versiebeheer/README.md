# Versiebeheer

Om een beter gevoel te krijgen met versie beheer ben ik aan de slag gegaan om een aantal microservices te maken met springboot in een nieuw project in GitHub.

Om het wat visueler te maken maak ik gebruik van Windows terminal en omgetoverd naar een *pretty prompt* Voordeel hiervan is, is dat het makkelijker te herkennen is in welke branch je bevindt en of uberhaupt Git actief is. [Configuratie van pretty promt, uitleg door Scott Hanselman](https://www.hanselman.com/blog/how-to-make-a-pretty-prompt-in-windows-terminal-with-powerline-nerd-fonts-cascadia-code-wsl-and-ohmyposh)

![[Pasted image 20210519201001.png]]

Java Brains heeft voor de betaalde leden een aantal speellijsten gemaakt, 1 hiervan is [GIT basics - Full Course](https://www.youtube.com/playlist?list=PLqq-6Pq4lTTZ-aIG0GbdYl8PYBxGcAMxJ).
Deze heb ik gevolgd om een beter begrip van Git te krijgen en wat je er mee kan.

Vervolgens ben ik mee aan de slag gegaan. Ik heb in Github een repository gemaakt genaamd [SpringBoot-API-Sensors](https://github.com/Koffiemolen/SpringBoot-API-Sensors)

Via [SpringBoot](https://start.springboot.io) heb ik de volgende services aangemaakt

- Eureka service (disovery server)
- Temperature retrieve service
- Temperature show service

Doel hiervan is dat de *temperature retrieve service* een api get verzoek doet naar een sensor om zo de data op te halen. De *temperature show service* roept de *temperature retrieve service* aan om zo data op het scherm te tonen.

Ik ben gestart met de templates in main te plaatsen
![[Pasted image 20210519201931.png]]

Het grote voordeel hiervan is dat ik per service een nieuwe branch aan kan maken. Zo blijft de code in main ongemoeit en wanneer ik tevreden ben of een collega / vriend mij wil helpen kan een andere branch aanmaken en daarmee aan de slag te gaan. Hierdoor blijft alles netjes gescheiden en kan er toch door verschillende mensen ontwikkeld worden.
![[Pasted image 20210519202213.png]]

Nadat alles werkt kan de branch gecommit en gemerged worden. De code wordt dan samengevoegd met de main branch.

![[Pasted image 20210519202405.png]]