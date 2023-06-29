import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-kata-for-fun-form',
  templateUrl: './kata-for-fun-form.component.html',
})
export class KataForFunFormComponent implements OnInit {
  formGroup: FormGroup;
  @Output() submitNumberOutput = new EventEmitter<number>();

  constructor(private formBuilder: FormBuilder) {
    this.formGroup = this.formBuilder.group({
      number: ['', Validators.required],
    });
  }

  ngOnInit(): void {}

  submitNumber(): void {
    if (this.formGroup.valid) {
      const number = this.formGroup.value.number;

      this.submitNumberOutput.emit(number);
      this.formGroup.reset();
    }
  }
}
