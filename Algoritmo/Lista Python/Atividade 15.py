#15. As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo
#menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da
#compra.

lista = list()
lista2 = list()

while True:
    value = int(input('Foram compradas quantas maçãs? '))
    lista2.append(value)

    if (value < 12):
        add = 1.30*value
        lista.append(add)
    elif (value >=12):
        add = 1*value
        lista.append(add)
    skip = str(input('Deseja continuar?(S/N) '))
    if skip in 'Nn':
        break
print(f'Foram compradas {sum(lista2)} maçãs')
print(f'O valor total a ser pago é de {sum(lista)}R$')
