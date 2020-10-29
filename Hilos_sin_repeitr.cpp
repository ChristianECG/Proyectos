#include <thread>
#include <iostream>
#include <fstream>

using namespace std;


void llamadoHiloA()
{
    int aleatorio, DESDE=250, HASTA=830;
    char cadena[128];
    cout << "Desde el Hilo A: " << "\n";
    ofstream fs("numeros.txt");
    ifstream fe("numeros.txt");
    for (int i = 0; i < 1000; i++) {
        aleatorio = rand()%(HASTA-DESDE+1)+DESDE;
        bool exist = false;
        while(!fe.eof()) {
          fe >> cadena;
          
          exist = cadena == aleatorio;
          
          if(exist){
            break;
          }
       }
       if(!exist){
           cout << aleatorio << "\n";
            fs << aleatorio <<  "\n";
       }
    }
    fs.close();
    cout << "Fin del For desde el Hilo A" << "\n";
}

void llamadoHiloB()
{
    int aleatorio, DESDE=250, HASTA=830;
    char cadena[128];
    cout << "Desde el Hilo B: " << "\n";
    ofstream fs("numeros.txt");
    ifstream fe("numeros.txt");
    for (int i = 0; i < 1000; i++) {
        aleatorio = rand()%(HASTA-DESDE+1)+DESDE;
        bool exist = false;
        while(!fe.eof()) {
          fe >> cadena;
          
          exist = cadena == aleatorio;
          
          if(exist){
            break;
          }
       }
       if(!exist){
           cout << aleatorio << "\n";
            fs << aleatorio <<  "\n";
       }
    }
    fs.close();
    cout << "Fin del For desde el Hilo B" << "\n";
}

void llamadoHiloC()
{
    int aleatorio, DESDE=250, HASTA=830;
    char cadena[128];
    cout << "Desde el Hilo C: " << "\n";
    ofstream fs("numeros.txt");
    ifstream fe("numeros.txt");
    for (int i = 0; i < 1000; i++) {
        aleatorio = rand()%(HASTA-DESDE+1)+DESDE;
        bool exist = false;
        while(!fe.eof()) {
          fe >> cadena;
          
          exist = cadena == aleatorio;
          
          if(exist){
            break;
          }
       }
       if(!exist){
           cout << aleatorio << "\n";
            fs << aleatorio <<  "\n";
       }
    }
    fs.close();
    cout << "Fin del For desde el Hilo C" << "\n";
}

int main()
{
    cout << "Estado Inicial" << "\n";
    thread thA(llamadoHiloA);
    thread thB(llamadoHiloB);
    thread thC(llamadoHiloC);
    
    //Ejecutar hilos en paralelo    
    thA.join();
    thB.join();
    thC.join();
    
    cout << "se ha terminado el Programa" << "\n";
    
    return 0;
    
}
