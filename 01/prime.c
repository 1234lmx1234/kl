#include <stdio.h>

int main() {
    int n = 99;
    //n++ --> n = n+1 ==>n���42
    //++n --> n = n+1 ==>n����42
    //int z = n++;//z��41,��n��42���ȸ�ֵ�����Լ�
    //int z = ++n;//z��42,nҲ��42�����Լ��ٸ�ֵ
    //if(n++>41) {}  int z = n++ z>41
    //n-- --> n = n-1

    int i;
    int flag = 1;
    for(i=2;i<n;i++) {
        if(n%i==0) {
            flag = 0;
            break;
        }
    }

    if(flag) {
        printf("%d������",n);
    } else {
        printf("%d��������",n);
    }

}
