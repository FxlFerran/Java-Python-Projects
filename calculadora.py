import tkinter as tk
from PIL import Image,ImageTk
import random as rn


class ventana1():

    def __init__(self):
        self.ventana1 = tk.Tk()
        self.ventana1.geometry("800x600")
        self.ventana1.minsize(600,500)
        self.ventana1.maxsize(800,600)

        self.imagenes = {
            1 : ImageTk.PhotoImage(Image.open("imagenes/otros.png")),
            2 : ImageTk.PhotoImage(Image.open("imagenes/dibujo.png")),
        }

        self.buno = tk.Button(self.ventana1, text="1", width=10, height=5, command=self.uno)
        self.buno.grid()
    
    def uno(self):
        ventana2(self.ventana1,self.imagenes)
    
    def run(self):
        self.ventana1.mainloop()

class ventana2():
    def __init__(self,app,imagenes):
        self.app = app
        self.ventana2 = tk.Toplevel(self.app)
        self.ventana2.geometry("500x500")
        self.ventana2.minsize(500,500)
        self.ventana2.maxsize(800,800)

        self.bdos = tk.Button(self.ventana2, text="2", width=10, height=5, command=lambda: self.dos(imagenes))
        self.bdos.grid()
    
    def dos(self,imagenes):
        try:
            self.lootbox.top.destroy()
        except Exception:
            pass
        finally:
            self.lootbox = Lootbox(self.ventana2,imagenes)

    
class Lootbox():
    def __init__(self,v2,imagenes):
        self.v2 = v2
        self.top = tk.Toplevel(self.v2)
        self.top.geometry("1000x1000")
        self.top.resizable(height=False,width=False)

        img = rn.randint(1,2)

        self.lbl = tk.Label(self.top,image=imagenes[img])
        self.lbl.place(x=100,y=100)

        if img == 1:
            self.top.config(bg="green")
        else:
            self.top.config(bg="yellow")

    


vnt1 = ventana1()
vnt1.run()



