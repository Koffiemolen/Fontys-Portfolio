Ontwikkelmethoden
=============================

## V-model, watervalmethode, agile
[The Complete SDLC Course for Beginners | Udemy](https://www.udemy.com/course/the-complete-sdlc-course-for-beginners/)

### Table of contents
✔ Software Development Life Cycle
✔ Waterfall Model
✔ Iterative and Incremental Model
✔ Spiral Model
✔ V-Model
✔ Big Bang Model
✔ Agile Model
✔ RAD Model
✔ Software Prototyping


## Domain Driven Design: Complete Software Architecture Course
[Domain Driven Design: Complete Software Architecture Course | Udemy](https://www.udemy.com/course/domain-driven-design-complete-software-architecture-course/)

### Table of contents
-   DDD building blocks    
-   Design modeling skills    
-   Design assignment - with model answers that are explained via video tutorial and feedback on your assignment from others if you'd like.    
-   Design patterns    
-   Component architecture    
-   Coding assignment - with model answers that are explained in detail via video tutorial 

Toen ik aan dit semester begon had ik nog geen flauw idee wat een V-model, watervalmethode was en hoe je dit moet implementeren.
Ik ben gaan zoeken en ben de bovenstaande cursussen gaan volgen.

In mijn huidig team werken (of proberen wij) scrum/agile te werken met een vleugje op de manier van mijn werkgever. Het is een eutopie om volledig scrum te werken. Maar zoals het nu geimplenteerd is werkt het erg goed.

Binnen de groepsopdracht zijn we gestart met een Scrumbord in Github. Ik heb een verwoede poging ondernomen om een andere tool te gebruiken, namelijk [Jira](https://www.atlassian.com/)
Maar de meeste van de groep wilde starten in Github.
Het bord zag er op een gegeven moment zo uit:

![[eerste_Scrumbord-bier.cool.png]]
*Eerste Scrumboard Bier.cool.*

Je kon al gauw merken in het groep dat het niet lekker werkte. De updates van de kaartjes ging moeizaam en het bord is vervolgens een stille dood gestorven.

Na de feedback van Jean-Peal waar we te horen kregen dat procesmatig alles een beetje als een eilandje eruit zag dacht ik dit moet anders!
Wat bij Agile/Scrum werken hoort is een retrospective. Ik heb de groep vervolgens uitgenodigt en hebben wij via de [Scrum zeilboot](https://miro.com/app/board/o9J_klDboNk=/?fromEmbed=1) een sessie gehouden wat door iedereen als zeer positief is ondervonden. 

![[Sailboat Retrospective.jpg]]
*Aangebrachte punten door het team.*

![[Sailboat Retrospective actiepunten.jpg]]
*Actiepunten die zijn voort gekomen uit de retro.*

## Jira & Scrumbord

In de actiepunten is naar voren gekomen dat we een nieuw Scrumbord willen/herintroduceren. Het huidige werkt niet en is niet uitnodigend om ermee te gaan werken. De kunst is om een onderdeel wat gemaakt moet worden(vaak wordt de term *Kaartje* gebruikt) zo klein mogelijk te maken en ook zo duidelijk mogelijk. Kortom een user story in de vorm van *Als ...., wil ik ...., zodat* .
Om dit te realiseren hebben wij ervoor gekozen voor het volgende:
- De *Als ..., wil ik ..., zodat ...* regel komt er in het kaartje te staan
- Definition of done
- Definition of Acceptance willen


![[ScrumBoard - Jira.png]]
De tool die we gebruiken is Jira, Hier op kan je makkelijk een overzicht creëren. 
We willen hier in 2 wekelijkse sprints werken waar in we stories onderverdelen in sub-tasks. Door de Sub-tasks een voor een af te ronden is het een stuk makkelijker om met meerdere personen aan een storie te werken en hou je een duidelijke voortgang in het oog. 

### To do lane:
In de To Do lane komen alle stories te staan die we in de desbetreffende sprint willen afronden.

### Progress lane:
Een subtask die onderderdeel uitmaakt van een story word naar de progress lane gesleept. Dit geeft aan dat de presoon waar de taak aan is toegewezen hier mee bezig is. 

### Review lane: 
Wanneer een Sub task is afgrond word deze naar de review lang toe gesleept. Dit is het punt dat deze getest kan worden.

### Done lane: 
In de done lane komen alle stories en sub tasks te staan die helemaal klaar zijn. Om dit punt te kunnen bereiken moet de Definition of Done worden nageleefd. Als dit allemaal is gedaan is de Story "Done"


## Scrum & V-model

### Definition of Done (DoD) 
De DoD komt neer op een check list. Hier staan een aantal punten in die gedaan moeten zijn voor de Sub-task of Story kan worden afgerond (status Done). Denk hier bij aan intergratie testen, unit testen en acceptatie testen. Hier kan een presentatie bij komen aan de hand van de Task/Story en een stukje documentatie. 

Om de DoD te bepalen hebben we de voor ons belangrijke principes uit het V model gepakt en hier in verwerkt. We hebben het testen wat in het V model centraal staat mee genomen in onze DoD. 

### Definition of Acceptance (DoA)
De DoA is een soort gelijke lijst als de DoD. Echter staan hier alle criteria in waar een Storie/Sub-task aan moet voldoen. Zonder deze eisen kan een Storie/Sub-task niet in een sprint komen. De reden dat deze eis er is, is zodat iedereen aan deze Story kan werken en dat er zo min mogelijk onduidelijkheid is over wat er in staat. 

### Hoe komt het V-model terug in het Scrumbord?
Het V-model heeft verschillende fase. Deze fase kan je terug laten komen binnen het Scrum proces. Zo kan je door middel van stories De linker kant van het V-model laten terug komen. Je maakt bijvoorbeeld een Story voor het maken van een functioneel of technisch ontwerp. Of je zorgt dat je de user requirements in kaart gaat brengen in een onderzoekstory. De rechter kant van het V-model gaat voornamelijk over valideren of testen. Dit onderdeel is erg belangrijk om op de juiste manier toe te passen binnen je project. Je wil ieder stukje software op de zelfde manier behandelen/testen. Dit hebben we verwerkt in de Definition of Done. Hier in staat een soort van checklist waar het stuk software aan moet voldoen voor deze volledig kan worden goed gekeurd.  

# V-model:

![[Pasted image 20210524103905.png]]
- [ ] intergratie testen (wat en wanneer)
- [ ] Unit testen (wat en wanneer)
- [ ] acceptatie testen (wat en wanneer)
- [x] Voor het V-model gebruiken wij DoD en DoA voldoende