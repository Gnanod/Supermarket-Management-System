-- drop database SuperMarket;
-- create database SuperMarket;
-- use SuperMarket;
-- create table Customer(
-- 	CustomerName varchar(100) not null,
-- 	CustId varchar(100) ,
-- 	CustomerGender varchar(100),
-- 	TelephoneNumber int(100) not null,
-- 	address varchar(100) not null,	
-- 	constraint primary key(custId) 
-- );
-- 
-- create table Orders(
-- 	orderId varchar(100)not null,
-- 	Date date,
-- 	custId varchar(100),
-- 	constraint primary key(orderId),
-- 	constraint foreign key(custId) references Customer(custId)
-- 	on delete cascade on update cascade
-- 	
-- );
-- 
-- create table payment(
-- 	paymentId varchar(100) not null,
-- 	orderId varchar(100),	
-- 	Date date,
-- 	amount decimal(10,2),
-- 	constraint primary key(paymentId),
-- 	constraint foreign key(orderId) references Orders(orderId)
-- 	on delete cascade on update cascade
-- );
-- 
-- create table Brand(
-- 	brandId varchar(100) not null,
-- 	brandName varchar(100),
-- 	constraint primary key(brandId)
-- );
-- 
-- create table Item(
-- 	itemId varchar(100) not null,
-- 	itemName varchar(100),
-- 	
-- 	brandId varchar(100),
-- 	constraint primary key(itemId),
-- 	constraint foreign key(brandId) references Brand(brandId)
-- 	on delete cascade on update cascade
-- );
-- 
-- create table Batch(
-- 	batchId varchar(100) not null,
-- 	itemId varchar(100),
-- 	unitPrice decimal(10,2),
-- 	amount decimal(10,2),
-- 	constraint primary key(batchId),
-- 	constraint foreign key(itemId) references Item(itemId)
-- 	on delete cascade on update cascade
-- );
-- 
-- create table OrderDetail(
-- 	OrderDetailId varchar(100) not null,
-- 	orderQuantity varchar(100),
-- 	orderId varchar(100),
-- 	Date date,
-- 	batchId varchar(100),
-- 	constraint primary key(orderDetailId),
-- 	constraint foreign key(orderId) references Orders(orderId)
-- 	on delete cascade on update cascade,
-- 	constraint foreign key(batchId) references Batch(batchId)
-- 	on delete cascade on update cascade
-- );
-- 
-- create table Damage(
-- 	batchId varchar(100) not null,
-- 	damageId varchar(10),
-- 	damageItemName varchar(10),	
-- 	amount decimal (10,2),
-- 	constraint primary key(damageId),
-- 	constraint foreign key(batchId) references Batch(batchId)
-- 	on delete cascade on update cascade
-- );
-- 
-- create table supplier(
-- 	 supplierName varchar(100),
-- 	 supplierId  varchar(100) not null,
-- 	 supplierGender varchar(100) not null,
-- 	 supplierTelNumber varchar(100),
-- 	 supplierAddress varchar(100),
-- 	 supplierCompanyName varchar(100),
-- 	 supplierCompanyAddress varchar(100),
-- 	 constraint primary key(supplierId)
-- 	 
-- );
-- create table User(
-- 	userName varchar(100) ,
-- 	userId varchar(100) not null,
-- 	gender varchar(20),
-- 	password varchar(10),
-- 	telNumber int(100),
-- 	address varchar(100),
-- 	constraint primary key(userId) 
-- );
-- 
-- create table supplierOrder(
-- 	supplierId varchar(100),
-- 	supplierOrderId varchar(100) not null,
-- 	constraint primary key(supplierOrderId)
-- );
-- create table supplierOrderDetail(
-- 	supplierOrderDetailId varchar (100),
--         supplierOrderId varchar(100),
-- 	itemId varchar(100),
-- 	orderDate varchar(100),
-- 	quantity decimal (10,2) not null,
-- 	buyingPrice decimal (10,2) not null,
-- 	totalAmount decimal (10,2) not null,
-- 	constraint primary key(supplierOrderDetailId),
-- 	constraint foreign key(supplierOrderId)references supplierOrder(supplierOrderId) on delete cascade on update cascade,
-- 	constraint foreign key(itemId)references item(itemId)on delete cascade on update cascade
-- 	
-- );

drop database SuperMarket;
create database SuperMarket;
use SuperMarket;
create table Customer(
	CustomerName varchar(100) not null,
	CustId varchar(100) ,
	CustomerGender varchar(100),
	TelephoneNumber int(100) not null,
	address varchar(100) not null,	
	constraint primary key(custId) 
);
create table supplier(
	 supplierName varchar(100),
	 supplierId  varchar(100) not null,
	 supplierGender varchar(100) not null,
	 supplierTelNumber varchar(100),
	 supplierAddress varchar(100),
	 supplierCompanyName varchar(100),
	 supplierCompanyAddress varchar(100),
	 constraint primary key(supplierId)
	 
);
create table grn(
	grnId varchar(100),
	Date varchar(100),
	constraint primary key(grnId) 
);

create table Brand(
	brandId varchar(100) not null,
	brandName varchar(100),
	constraint primary key(brandId)
);
create table Item(
	itemId varchar(100) not null,
	itemName varchar(100),
	
	brandId varchar(100),
	constraint primary key(itemId),
	constraint foreign key(brandId) references Brand(brandId)
	on delete cascade on update cascade
);

create table Batch(
	batchId varchar(100) not null,
	itemId varchar(100),
	grnId varchar(100),
	unitPrice decimal(10,2),
	
	amount decimal(10,2),
	constraint primary key(batchId),
	constraint foreign key(itemId) references Item(itemId)
	on delete cascade on update cascade,
	constraint foreign key(grnId) references grn(grnId) on delete cascade on update cascade

);

create table supplierOrder(
	supplierId varchar(100),
	supplierOrderId varchar(100) not null,
	constraint primary key(supplierOrderId),
        constraint foreign key(supplierId)references supplier(supplierId) on delete cascade on update cascade
);

create table supplierOrderDetail(
	supplierOrderId varchar(100) not null,
	itemId varchar(100) not null,
	orderDate varchar(100),
	quantity decimal (10,2),
	buyingPrice decimal (10,2),
	totalAmount decimal (10,2),
	constraint primary key(supplierOrderId,itemId),
	constraint foreign key(supplierOrderId)references supplierOrder(supplierOrderId) on delete cascade on update cascade,
	constraint foreign key(itemId)references item(itemId)on delete cascade on update cascade
	
);


create table grnDetail(
	grnId varchar(100),
	itemId varchar(100)not null,
	date varchar(100),
	sellingPrice decimal(10,2),
	buyingPrice decimal(10,2),
	Quantity decimal(10,2),
	constraint primary key(grnId,itemId),
	constraint foreign key(grnId)references grn(grnId) on delete cascade on update cascade,
	constraint foreign key(itemId)references item(itemId)on delete cascade on update cascade
	
);

create table customerOrder(
	CustId varchar(100),
	customerOrderId varchar(100)not null,
	orderDate varchar(100),
	constraint primary key(customerOrderId),
        constraint foreign key(CustId)references Customer(CustId) on delete cascade on update cascade

);

create table customerOrderDetail(
	customerOrderId varchar(100),
	batchId varchar(100),
	quantity decimal(10,2),
	grossAmount decimal(10,2),
	discount decimal(10,2),
	netAmount decimal(10,2),
	constraint primary key(customerOrderId ,batchId),
	constraint foreign key(customerOrderId)references customerOrder(customerOrderId) on delete cascade on update cascade,
	constraint foreign key(batchId)references Batch(batchId) on delete cascade on update cascade
	
	
);

create table customerPayment(
	customerOrderId varchar(100),
	paymentId varchar(100),
	paymentType varchar(100),
	date varchar(100),
	grossAmount decimal(10,2),
	discount decimal(10,2),
	netAmount decimal(10,2),
	constraint primary key(paymentId),
	constraint foreign key(customerOrderId)references customerOrder(customerOrderId) on delete cascade on update cascade
);
create table User(
	userName varchar(100) ,
	userId varchar(100) not null,
	userType varchar(20) not null,
	gender varchar(20),
	password varchar(10),
	telNumber int(100),
	address varchar(100),
	constraint primary key(userId) 
);
create table supplierOrderPayment(
	supplierPaymentId varchar(100) not null,
	grnId varchar(100) not null,
	paymentType varchar(100) not null,
	Date date,
	constraint primary key(supplierPaymentId),
	constraint foreign key(grnId)references grn(grnId) on delete cascade on update cascade
	
);