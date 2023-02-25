import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';

@NgModule({
  imports: [
    RouterModule.forChild([
      {
        path: 'product',
        data: { pageTitle: 'imaApp.product.home.title' },
        loadChildren: () => import('./product/product.module').then(m => m.ProductModule),
      },
      {
        path: 'categories',
        data: { pageTitle: 'imaApp.categories.home.title' },
        loadChildren: () => import('./categories/categories.module').then(m => m.CategoriesModule),
      },
      {
        path: 'unit',
        data: { pageTitle: 'imaApp.unit.home.title' },
        loadChildren: () => import('./unit/unit.module').then(m => m.UnitModule),
      },
      {
        path: 'ware-house',
        data: { pageTitle: 'imaApp.wareHouse.home.title' },
        loadChildren: () => import('./ware-house/ware-house.module').then(m => m.WareHouseModule),
      },
      {
        path: 'product-inventory',
        data: { pageTitle: 'imaApp.productInventory.home.title' },
        loadChildren: () => import('./product-inventory/product-inventory.module').then(m => m.ProductInventoryModule),
      },
      {
        path: 'project',
        data: { pageTitle: 'imaApp.project.home.title' },
        loadChildren: () => import('./project/project.module').then(m => m.ProjectModule),
      },
      {
        path: 'consumption-details',
        data: { pageTitle: 'imaApp.consumptionDetails.home.title' },
        loadChildren: () => import('./consumption-details/consumption-details.module').then(m => m.ConsumptionDetailsModule),
      },
      {
        path: 'product-transaction',
        data: { pageTitle: 'imaApp.productTransaction.home.title' },
        loadChildren: () => import('./product-transaction/product-transaction.module').then(m => m.ProductTransactionModule),
      },
      {
        path: 'purchase-quotation',
        data: { pageTitle: 'imaApp.purchaseQuotation.home.title' },
        loadChildren: () => import('./purchase-quotation/purchase-quotation.module').then(m => m.PurchaseQuotationModule),
      },
      {
        path: 'purchase-quotation-details',
        data: { pageTitle: 'imaApp.purchaseQuotationDetails.home.title' },
        loadChildren: () =>
          import('./purchase-quotation-details/purchase-quotation-details.module').then(m => m.PurchaseQuotationDetailsModule),
      },
      {
        path: 'goods-recived',
        data: { pageTitle: 'imaApp.goodsRecived.home.title' },
        loadChildren: () => import('./goods-recived/goods-recived.module').then(m => m.GoodsRecivedModule),
      },
      {
        path: 'transfer',
        data: { pageTitle: 'imaApp.transfer.home.title' },
        loadChildren: () => import('./transfer/transfer.module').then(m => m.TransferModule),
      },
      {
        path: 'transfer-details',
        data: { pageTitle: 'imaApp.transferDetails.home.title' },
        loadChildren: () => import('./transfer-details/transfer-details.module').then(m => m.TransferDetailsModule),
      },
      {
        path: 'transfer-details-approvals',
        data: { pageTitle: 'imaApp.transferDetailsApprovals.home.title' },
        loadChildren: () =>
          import('./transfer-details-approvals/transfer-details-approvals.module').then(m => m.TransferDetailsApprovalsModule),
      },
      {
        path: 'transfer-recieved',
        data: { pageTitle: 'imaApp.transferRecieved.home.title' },
        loadChildren: () => import('./transfer-recieved/transfer-recieved.module').then(m => m.TransferRecievedModule),
      },
      {
        path: 'security-user',
        data: { pageTitle: 'imaApp.securityUser.home.title' },
        loadChildren: () => import('./security-user/security-user.module').then(m => m.SecurityUserModule),
      },
      {
        path: 'notification',
        data: { pageTitle: 'imaApp.notification.home.title' },
        loadChildren: () => import('./notification/notification.module').then(m => m.NotificationModule),
      },
      {
        path: 'security-role',
        data: { pageTitle: 'imaApp.securityRole.home.title' },
        loadChildren: () => import('./security-role/security-role.module').then(m => m.SecurityRoleModule),
      },
      {
        path: 'security-permission',
        data: { pageTitle: 'imaApp.securityPermission.home.title' },
        loadChildren: () => import('./security-permission/security-permission.module').then(m => m.SecurityPermissionModule),
      },
      {
        path: 'user-access',
        data: { pageTitle: 'imaApp.userAccess.home.title' },
        loadChildren: () => import('./user-access/user-access.module').then(m => m.UserAccessModule),
      },
      /* jhipster-needle-add-entity-route - JHipster will add entity modules routes here */
    ]),
  ],
})
export class EntityRoutingModule {}
