kw=float(input("quantos kw você gastou esse mês?"))
tipo=float(input("qual seu tipo cliente? [1]Residência [2]Comércio [3]Indústria"))
if (tipo == 1):
    print(f"O total da sua conta de luz sera: R$ {kw * 0.60:.1f}")

if (tipo == 2):
    print(f"O total da sua conta de luz sera: R${(kw * 0.48):.1f}")

if (tipo == 3):
    print(f"O total da sua conta de luz sera: R${(kw * 1.29):.1f}")

    # +++++SKLEO+++++
    # ┈╭━━━━━━━━━━━╮┈
    # ┈┃╭━━━╮┊╭━━━╮┃┈
    # ╭┫┃┈▇┈┃┊┃┈▇┈┃┣╮
    # ┃┃╰━━━╯┊╰━━━╯┃┃
    # ╰┫╭━╮╰━━━╯╭━╮┣╯
    # ┈┃┃┣┳┳┳┳┳┳┳┫┃┃┈
    # ┈┃┃╰┻┻┻┻┻┻┻╯┃┃┈
    # ┈╰━━━━━━━━━━━╯┈


