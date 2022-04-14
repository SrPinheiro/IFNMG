#14. Escrever um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a
#sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e
#Recuperação (media entre 5.1 a 6.9).

nome = str(input('Digite o nome do aluno: '))
note1 = float(input('Digite a primeira nota: '))
note2 = float(input('Digite a segunda nota: '))
note3 = float(input('Digite a terceira nota: '))

media = (note1 + note2 + note3)/3

if (media <= 5):
    print(f'{nome} está Reprovado!')
elif (media >= 7):
    print(f'{nome} está Aprovado!')
else:
    print(f'{nome} está de recuperação!')