Struktur, komponenter och klasser för projektet.

Klasser: 
Quiz, User, UserManager, Questions, ListwithQuestions, DifficultyChoice, Art, QuizTest (testfil) och Questions.json.

Struktur: 
- "Quiz" innehåller main-metoden för att starta applikationen och köra quizet. I main beskrivs quizet för användaren och anropar metoder för att skriva in användarnamn, välja hus, välja svårighetsgrad och välja alternativ till frågor. I slutet av main anropas en metod som räknar ut poängen samt en annan metod som skriver ut alla användare som spelat. Hela spelet är placerat i en while-loop, då användaren ska kunna spela om spelet.
- "User" innehåller olika metoder för att hämta och skriva ut användarnamn, hus, poäng och hashcode.
- "UserManager" är en generisk subklass för klassen "User" och innehåller en metod för att placera alla användare i en arrayList. Metoden ser över listan och kollar om användaren redan finns eller är unik.
- "Questions" tar in fråga, alternativ, rätt svar och svårighetsgrad från "Questions.json" filen. Klassen innehåller en metod som skriver ut frågan tillsammans med 3 alternativ och en annan metod som ser över användarens svar och skriver ut om det är rätt eller fel svar.
- "Questions.json" innehåller en arraylist med alla frågor, alternativ, rätt svar och svårighetsgrad på frågan.
- "ListQithQuestions" sorterar alla frågor utifrån svårighetsgrad och skapar tre olika arraylist som kallas "Easy", "Medium" och "Hard".
- "DifficultyChoice" frågar användaren vilken svårighetsgrad hen vill spela och skriver sen ut rätt arrayList utifrån val av svårighetsgrad.
- "Art" innehåller bara SystemOutPrintln grafik.
- "QuizTest" testar flera delar av projektet.
