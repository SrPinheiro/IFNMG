# Defina uma função divisao() que recebe dois números como parâmetros, calcula e retorna o resultado da divisão do primeiro pelo segundo. Modifique a função velocidade_media() utilizando a função divisao() para calcular a velocidade. Teste o seu código chamando a função velocidade_media() com os valores abaixo:
# a. distância: 100, tempo = 20
# b. distância: -20, tempo = 10
# c. distância: 150, tempo = 0

def divisao(a, b):
    resultado = a/b
    return resultado

def velocidade_media(a, b):
    v = divisao(a, b)
    return v

tex='Não é possivel dividir por 0'
try:
    print(velocidade_media(100, 20))
except:
    print(tex)

try:
    print(velocidade_media(-20, 10))
except:
    print(tex)

try:
    print(velocidade_media(150, 0))
except:
    print(tex)

#+++++SKLEO+++++
#┈╭━━━━━━━━━━━╮┈
#┈┃╭━━━╮┊╭━━━╮┃┈
#╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮
#┃┃╰━━━╯┊╰━━━╯┃┃
#╰┫╭━╮╰━━━╯╭━╮┣╯
#┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈
#┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈
#┈╰━━━━━━━━━━━╯┈