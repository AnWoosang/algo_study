#include <iostream>
#define For(i, n) for(int i = 0; i < (n); i++)

using namespace std;

int main(){
    
    int arr1[4] = [1, 2, 3, 4];
    int arr2[4] = [1, 2, 3, 4];
    int i, j;

    For(i, arr1.size()){
        For(j, i){
            if (arr1[i] == arr2[j]){
                cout << "같다" << endl;
            }
        }
    }

    return 0;
}