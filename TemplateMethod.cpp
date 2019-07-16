#include <iostream>
#include <string>
using namespace std;

int isdigit( char ch ) { 
	return (ch >= '0' && ch <= '9') ? 1 : 0; 
}
int isupper( char ch ) { 
	return (ch >= 'A' && ch <= 'Z') ? 1 : 0; 
}
int islower( char ch ) { 
	return (ch >= 'a' && ch <= 'z') ? 1 : 0; 
}

class DataEntry {
public:
   void setValidationType( char ch ) { 
	   type = ch; 
   }
   void interact();
private:
   char type;
   int  validate( char* );
};

void DataEntry::interact() {
   char  answer[20];
   cout << "Prompt: ";
   cin >> answer;
   while (strcmp( answer, "quit" )) {
      if (validate( answer )) cout << "*** good ***" << endl;
      else                    cout << "*** bad ***" << endl;
      cout << "Prompt: ";
      cin >> answer;
	}  
}

int DataEntry::validate( char* input ) {
   int       valid;
   unsigned  i;
   valid = 1;
   if (type == 'n') {
      for (i=0; i < strlen(input); i++)
         if ( ! isdigit( input[i] ) ) {
            valid = 0;
            break;
         }
   } 
   else if (type == 'u') {
      for (i=0; i < strlen(input); i++)
         if ( ! isupper( input[i] ) ) {
            valid = 0;
            break;
         }
   } 
   else if (type == 'l') {
      for (i=0; i < strlen(input); i++)
         if ( ! islower( input[i] ) ) {
            valid = 0;
            break;
         }
   }
   return valid;
}

void main( void ) {
   DataEntry  dialog;
   char       answer;
   cout << "Input type [ (n)umber, (u)pper, (l)ower, e(x)it ]: ";
   cin >> answer;
   while (answer != 'x') {
      dialog.setValidationType(answer);
      dialog.interact();
      cout << "Input type [ (n)umber, (u)pper, (l)ower, e(x)it ]: ";
      cin >> answer;
	}  
}

// Input type [ (n)umber, (u)pper, (l)ower, e(x)it ]: n
// Prompt: sdf
// *** bad ***
// Prompt: 234
// *** good ***
// Prompt: quit
// Input type [ (n)umber, (u)pper, (l)ower, e(x)it ]: u
// Prompt: sdf
// *** bad ***
// Prompt: 234
// *** bad ***
// Prompt: GHJ
// *** good ***
// Prompt: quit
// Input type [ (n)umber, (u)pper, (l)ower, e(x)it ]: x

