//Coding Ninjas

Node *addTwoNumbers(Node *num1, Node *num2)
{
    Node *dummy=new Node();
    Node *temp=dummy;
    int carry=0;
    while(num1!=NULL || num2!=NULL || carry!=0)
    {
        int sum=0;
        if(num1 != NULL)
        {
            sum+=num1->data;
            num1=num1->next;
        }
        if(num2 != NULL)
        {
            sum+=num2->data;
            num2=num2->next;
        }
        sum+=carry;
        carry=sum/10;
        Node* newtempnode=new Node(sum%10);
        temp->next=newtempnode;
        temp=temp->next;
    }
    return dummy->next;
}
