# Hora de aventura, cadena alimenticia

cadena_alimenticia = [
    (
        "Pájaros",
        "El Hombre Mágico los transforma en pájaros. Comen orugas y se llenan rápidamente.",
    ),
    (
        "Pájaro Grande",
        "Finn se convierte en un pájaro grande. Intenta comer a Jake, quien también es un pájaro en este punto.",
    ),
    (
        "Bacterias",
        "Después de ser comidos por un pájaro grande, Finn y Jake se convierten en bacterias.",
    ),
    (
        "Plantas",
        "Las bacterias se convierten en nutrientes que son absorbidos por las plantas.",
    ),
    (
        "Orugas",
        "Las plantas son comidas por las orugas, y Finn y Jake se convierten en orugas.",
    ),
    (
        "Pájaros",
        "Las orugas son comidas por los pájaros, y Finn y Jake vuelven a ser pájaros.",
    ),
]


# Define una función recursiva para modelar la cadena alimenticia
def hora_de_aventura(cadena, indice=0):
    # Imprime la etapa actual y su mensaje
    print(f"Finn y Jake son ahora: {cadena[indice][0]}")
    print(cadena[indice][1])

    # Si estamos al final de la cadena, retorna
    if indice == len(cadena) - 1:
        return

    # De lo contrario, avanza a la siguiente etapa
    hora_de_aventura(cadena, indice + 1)


# Llama a la función para comenzar la aventura
hora_de_aventura(cadena_alimenticia)
