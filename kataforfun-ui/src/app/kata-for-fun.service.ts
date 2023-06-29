import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root',
})
export class KataForFunService {
  private apiUrl: string;

  constructor(
    private http: HttpClient,
    @Inject('SERVER_URL') private serverUrl: string
  ) {
    this.apiUrl = `${this.serverUrl}/kata-for-fun`;
  }

  convertNumber(inputNumber: number): Observable<ResultDto> {
    const url = `${this.apiUrl}/${inputNumber}`;
    const result = this.http.get<ResultDto>(url);
    return result;
  }
}

export interface ResultDto {
  result: string;
}
