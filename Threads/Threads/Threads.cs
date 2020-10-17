using System;
using System.CodeDom;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading;
using System.Threading.Tasks;

namespace Threads
{
    class Program
    {
        public static int[] generados = new int[15];
        public static int indice = 0;

        static void Main(string[] args)
        {
            Thread thread1 = new Thread(() => ThreadWork.DoWork("A", 5, 77, 500));
            Thread thread2 = new Thread(() => ThreadWork.DoWork("B", 5, 88, 700));
            Thread thread3 = new Thread(() => ThreadWork.DoWork("C", 5, 99, 1200));
            thread1.Start();
            thread2.Start();
            thread3.Start();
            Console.ReadKey();
        }
    }

    public class ThreadWork
    {
        public static void DoWork(string name, int cont, int max, int delay)
        {
            Console.WriteLine("Inicio de hilo {0}", name);
            for (int i = 0; i < cont; i++)
            {
                Thread.Sleep(delay);
                int numero = new Random().Next(max);
                if (VerificarNoRepetido(numero))
                {
                    Console.WriteLine("Hilo {0}: {1}", name, numero);
                    Program.generados[Program.indice++] = numero;
                }
                else
                {
                    i--;
                }
            }
            Console.WriteLine("Fin de hilo {0}", name);
        }

        private static bool VerificarNoRepetido(int num)
        {
            int cant = 0;
            foreach (int j in Program.generados)
            {
                if (num == j)
                    cant++;
            }
            return cant == 0;
        }
    }
}