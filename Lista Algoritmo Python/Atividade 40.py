gr=''
nome=str(input("diga seu nome:"))
idade=int(input("diga sua idade:"))

if 70 < idade < 17:
    print("você não esta na faixa de idade")

else:
    gr=str(input("Selecione o seu grupo de risco:\nAlto medio baixo:"))
    if idade >= 17 and idade <= 20 and gr.lower().lower() == "baixo":
        print(nome, " sua classificação é 1")
    if idade >= 17 and idade <= 20 and gr.lower() == "medio":
        print(nome, " sua classificação é 2")
    if idade >= 17 and idade <= 20 and gr.lower() == "alto":
        print(nome, " sua classificação é 3")
    if(idade >= 21 and idade <= 24 and gr.lower() == "baixo"):
        print(nome, " sua classificação é 2")
    if(idade >= 21 and idade <= 24 and gr.lower() == "medio"):
        print(nome, " sua classificação é 3")
    if(idade >= 21 and idade <= 24 and gr.lower() == "alto"):
        print(nome, " sua classificação é 4")
    if(idade >= 25 and idade <= 34 and gr.lower() == "baixo"):
        print(nome, " sua classificação é 3")
    if(idade >= 25 and idade <= 34 and gr.lower() == "medio"):
        print(nome, " sua classificação é 4")
    if(idade >= 25 and idade <= 34 and gr.lower() == "alto"):
        print(nome, " sua classificação é 5")
    if(idade >= 35 and idade <= 64 and gr.lower() == "baixo"):
        print(nome, " sua classificação é 4")
    if(idade >= 35 and idade <= 64 and gr.lower() == "medio"):
        print(nome, " sua classificação é 5")
    if(idade >= 35 and idade <= 64 and gr.lower() == "alto"):
        print(nome, " sua classificação é 6")
    if(idade >= 65 and idade <= 70 and gr.lower() == "baixo"):
        print(nome, " sua classificação é 7")
    if(idade >= 65 and idade <= 70 and gr.lower() == "medio"):
        print(nome, " sua classificação é 8")
    if(idade >= 65 and idade <= 70 and gr.lower() == "alto"):
        print(nome, "sua classificação é 9")

#+++++SKLEO+++++
#┈╭━━━━━━━━━━━╮┈
#┈┃╭━━━╮┊╭━━━╮┃┈
#╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮
#┃┃╰━━━╯┊╰━━━╯┃┃
#╰┫╭━╮╰━━━╯╭━╮┣╯
#┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈
#┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈
#┈╰━━━━━━━━━━━╯┈
