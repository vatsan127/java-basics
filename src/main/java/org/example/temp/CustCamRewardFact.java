package org.example.temp;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class CustCamRewardFact {
	private String msisdn;
	private String camId;
	private String stepNumber;
	private String rewardId;
	private Timestamp rewardSentTime;
	private int rewardStatus;
	private Timestamp responseTime;
	private String endPoint;
	private String function;
	private String transactionId;
	private byte eventGenerated;
	private String rewardValidity;
	private String refTransactionId;
	private String rewardParams;
	private String PARTITON_KEY;
	
}
