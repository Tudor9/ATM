# ATM

![ATMDiagram](docs/AtmDiagram.png)

1. I have created a real time accesing ATM for users.
    * _insertCard()_ method from ATM will compare received pin with the pin stored in card. If 2 pins match the card will be stored as attribute and will be used for executing transactions.
    * _removeCard()_ method will invalidate a previously inserted card by making the attribute null. 
    *_transferMoney()_ method whitch use 2 classes *transferMoneySender and *transferMoneyReceiver will acces first _transferMoneySender_ where it will take the money from current account, and beneficiary user will receive the amount of money in _transferMoneyReceiver_ where it will be stored in beneficiary account. Payer should introduce the id of beneficary user to make the transaction.
         *_payInvoices()_ is a method where you can pay invoices from gass, water and electricity consumed. This method access data from *InvoicesData where is stocated the amount of money that users should pay for these utilities consumed. When user acces this method and pay from one of each utilities, the money from user account is taken and the invoice is paid.

