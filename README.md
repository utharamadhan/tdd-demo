# Test-Driven Development Demo
This is a simple repository for anyone of you who wants to hands-on the TDD technique.

We already provide you with an existing logic sample of COVID vaccine eligibility. The criteria:

| Range of Age | Eligible? |
|:-------------:|:------:|
| < 15 | NO |
| 15 - 60 | YES |
| \> 60 | NO |

Based on that criteria, we already write a simple service implementation to satisfy the requirement. The input itself is an object of Patient along with its name, gender, and dateOfBirth (MonthDayYear).

Suddenly, there's an update from the WHO organisation. Apparently, there's changes on the criteria. Need your help to update the codes to satisfy this criteria: 

### 1. Update Definition of Age
We need to use the "Nearest Birth Date" logic to determine how old is the patient. 
For example, Hengky was born on 13th December 2000, if today is 12th December of 2021, system should determine that he's 21 years old today.
Since the days difference between today with the 13th December 2020 (350ish days) is much bigger than today with the 13th December 2021 (1 day only), in a simple words he's closer to his birthday when he will be 21 y/0.

### 2. Include Gender as One of Eligibility Factor
| Range of Age | Gender | Eligible? |
|:-------------:|:------:|:------:|
| < 15 | MALE | NO |
| 15 - 60 | MALE | YES |
| \> 60 | MALE | NO |
| < 15 | FEMALE | NO |
| 15 - 60 | FEMALE | YES |
| \> 60 | FEMALE | YES |


