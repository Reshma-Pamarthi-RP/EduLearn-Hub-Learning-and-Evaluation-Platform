import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'mobile'
})
export class MobilePipe implements PipeTransform {

  transform(value: any, country: any): any {
    if (country === 'INDIA') {
      return '+91 - ' + value;
    } else if (country === 'USA') {
      return '+1 - ' + value;
    } else {
    return value;
    }
  }

}
