import dayjs from 'dayjs/esm';

import { IGoodsRecived, NewGoodsRecived } from './goods-recived.model';

export const sampleWithRequiredData: IGoodsRecived = {
  id: 65331,
};

export const sampleWithPartialData: IGoodsRecived = {
  id: 51670,
  expiryDate: dayjs('2023-02-24T08:33'),
  lotNo: 'Computer',
  freeField3: 'Tennessee',
};

export const sampleWithFullData: IGoodsRecived = {
  id: 3633,
  grDate: dayjs('2023-02-24T23:15'),
  qtyOrdered: 99858,
  qtyRecieved: 90543,
  manufacturingDate: dayjs('2023-02-25T04:40'),
  expiryDate: dayjs('2023-02-24T12:20'),
  lotNo: 'Loan Guatemala Front-line',
  freeField1: 'Colorado Islands Oklahoma',
  freeField2: 'bypass synthesizing Strategist',
  freeField3: 'Branch generate',
};

export const sampleWithNewData: NewGoodsRecived = {
  id: null,
};

Object.freeze(sampleWithNewData);
Object.freeze(sampleWithRequiredData);
Object.freeze(sampleWithPartialData);
Object.freeze(sampleWithFullData);
