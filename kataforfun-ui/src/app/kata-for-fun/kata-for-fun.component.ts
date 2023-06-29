import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subscription } from 'rxjs';
import { KataForFunService, ResultDto } from '../kata-for-fun.service';

@Component({
  selector: 'app-kata-for-fun',
  templateUrl: './kata-for-fun.component.html',
  styleUrls: ['./kata-for-fun.component.css'],
})
export class KataForFunComponent implements OnInit, OnDestroy {
  private subscription: Subscription | undefined;
  convertedValues: NumberConverted[] = [];

  constructor(private kataForFunService: KataForFunService) {}

  ngOnInit(): void {}

  ngOnDestroy(): void {
    if (this.subscription) {
      this.subscription.unsubscribe();
    }
  }

  convertNumber(inputNumber: number): void {
    this.subscription = this.kataForFunService
      .convertNumber(inputNumber)
      .subscribe(
        (result: ResultDto) => {
          this.convertedValues.push({
            numberToConvert: inputNumber,
            result: result.result,
          });
        },
        (error: any) => {
          alert('Error during kataforfunservice suscribe step');
          console.log('Error during kataforfunservice suscribe step');
        },
        () => {
          // Handle the completion of the subscription if needed
        }
      );
  }
}

interface NumberConverted {
  numberToConvert: number;
  result: string;
}
