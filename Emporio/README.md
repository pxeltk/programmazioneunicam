In breve: Software che possa mostrare cosa c'è nel magazzino, calcolare il valore di tutti gli articoli del magazzino, vendere un articolo, aggiungere un articolo e cercare un articolo nel magazzino tramite codice a barre.

Titolo: Emporio

Si vuole realizzare un programma che gestisce gli articoli di un emporio. Gli articoli sono memorizzati in un file dal nome EMPORIO.TXT. I dati relativi a ciascun articolo sono presenti in una riga del file. Ad esempio
E;U;10;1,5;87678350;Lampada;150
Indica che l'articolo è del reparto [E] elettricità, viene venduto a pezzo [U], ve ne sono 10, costa 1.5 Euro, ha un codice univoco, si tratta di una lampada e consuma 150 Watt.
La prima lettera indica il reparto: [E] elettricità, [F] ferramenta, [L] legno, etc.
La seconda lettera l'unità di misura: [U] per unità, [K] per chilo, [L] per litro, ecc. Di seguito il numero di pezzi presenti in magazzino. Quindi il prezzo espresso in Euro seguito da un codice di 8 cifre che rappresenta il codice a barre univoco per ogni articolo.
A seguire altre caratteristiche specifiche per il tipo di articolo. Il separatore dei valori è ";".
Il programma legge ciascuna riga e crea un oggetto per ogni articolo. Se la riga rappresenta un oggetto non riconosciuto dal programma, viene ignorato. Un contatore indica le righe non riconosciute. Se vi sono due articolo con lo stesso codice univoco viene segnalato un errore. La quantità non può essere un numero negativo.
Una volta caricato l'inventario si possono eseguire le seguenti operazioni: 
* calcolo del valore totale del magazzino
* vendita di un prodotto 
* inserimento di un prodotto
* ricerca di un prodotto mediante codice univoco.
Vi possono essere operazioni che possono essere applicate ad articoli differenti per tipologia. Ad esempio il calcolo della resa. ovvero il rapporto costo diviso unità di misura è applicabile solo agli articoli divisibili come vernici, lampada, etc.

Il progetto deve essere corredato dalle seguenti statistiche, ovvero la numerosità di ciascun categoria di costrutti presenti nel progetto.

Classi __ Interfacce __ Classi astratte __ Sovraccarico di metodi/costruttori __ Sovrascrittura di metodi __ Eccezioni __ Enumerazioni __
             public   protected   private
Attributi      __        __         __
Metodi         __        __         __
             classi   attributi   metodi
Uso di final   __        __         __
Uso di static  __        __         __



Creare una classe (anche astratta) chiamata MAGAZZINO o EMPORIO.
La classe che specializza la classe precedente sarà il REPARTO.
Nei reparti ci saranno degli articoli gestiti con la classe ARTICOLO.
Ciascun articolo può avere unità di misura diverse con sistemi di calcolo del valore moentario diverso. Per gestire questo aspetto creare la classe UNITA_MISURA.
E’ necessaria anche una classe per leggere e scrivere il file archivio chiamata FILE.

Classe MAIN:
    Metodi:
Menu programma

Classe ARTICOLO:
    Metodi:
Aggiungi articolo
Nuovo articolo
Vendi aticolo
Ricerca articolo


Classe EMPORIO:
    Metodi:
Calcolo valore totale emporio
Interpretazione articoli letti da FILE
...

    Classe figlia REPARTO:
        Metodi:
Aggiungi reparto (?)
Elimina reaparto (?)
Calcolo valore reparto



Classe UNITA_MISURA:
    Metodi:
Calcolo valore articolo
…

Classe FILE:
    Metodi:
Lettura file
Scrittura file
