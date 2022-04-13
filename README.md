Geofencing - Pyramides
=======================

Livrable du test technique Home Labs.

Introduction
------------
Un geofence est un périmètre virtuel défini par GPS ou RFID autour d'une zone du monde réel.
Les clôtures géographiques peuvent être créées avec un rayon autour d'un emplacement ponctuel.

Cette application repère lorsque l'utilisateur entre dans le rayon du 29 rue des Pyramides dans le 1er arrondissement.
Une notification sera envoyée sur son téléphone dès l'instant où Pierre entrera ou quittera ce rayon. La précision est de 20m.

L'idée étant qu'à chaque fois que l'application repère une entrée ou une sortie dans ce rayon, l'application puisse notifier au système Home Labs (par exemple par l'intermédiaire d'une requête en POST) que l'utilisateur a quitté ou est rentré à son domicile. 

Si l'un des deux téléphones est notifié présent au domicile, alors le système Home Labs laisse l'alarme désactivée.
Si aucun des téléphones n'est présent physiquement au domicile, alors l'alarme est activée.

L'alarme se déclenchera si le détecteur d'ouverture de porte ou de la porte d'entrée détecte une personne physiquement alors qu'aucun des deux téléphones n'est indiqué présent par le système Home Labs. 


Condition préalables
--------------
- La dernière version de Android Studio.
- La version minimum SDK API 29 sur votre téléphone ou emulator. Cela devrait fonctionner à une API en dessous mais pourrait apparaître différemment à l'écran.

Pour commencer
---------------
1. Télécharger et lancer l'app.
2. Sous l'API 29 et au dessus, appliquez "Always allow" permission; Autrement, appliquez "Allow" pour les permissions de géolocalisation.
