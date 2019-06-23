# Vigenère Cipher

Programa desarrollado por aburrimiento.

La clase `Vigenere` está desarrollada con mi cabeza, probablemente sea un algoritmo **muy poco eficiente**, os explico un poco:

- En la clase hay un campo `POLI_ALFABETO` el cual representa la tabla de Vigenère en un Array de dos dimensiones.

- El método `cifrar()` usa la misma lógica que se emplea con papel y lápiz, es decir, repite la _clave_ a lo largo del _texto a cifrar_ y recorre cada letra de ambas cadenas para sacar cada _letra cifrada_ gracias a la intersección de columnas y filas.
  
  ![Representación cifrar](https://i.imgur.com/twn5STI.png)

- La lógica del método `descifrar()` es prácticamente igual a la del anterior, pero en éste va a cada fila correspondiente la letra actual de la _clave_, y en la misma fila, hasta la letra correspondiente del _texto cifrado_, y de esta forma identificar la _letra en claro_ (columna).
  
  ![Representación descifrar](https://i.imgur.com/O5r4BYL.png)

## Menciones honoríficas

[Pintar fila y columna de la celda seleccionada (StackOverflow)](https://stackoverflow.com/questions/43874891/both-row-and-column-selection-on-jtable#answer-43966516)
