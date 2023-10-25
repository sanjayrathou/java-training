# include <stdio.h>
int main (){
    int i = 65;
   
    while (i < (65+26)){
        char c =(char)i;
        printf("%c : %d\n",c,i);
        i++;
    }
    
    return 0;

}