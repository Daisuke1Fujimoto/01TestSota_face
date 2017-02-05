//このソースは、VstoneMagicによって自動生成されました。
//ソースの内容を書き換えた場合、VstoneMagicで開けなくなる場合があります。
package	jp.co.mysota;
import	main.main.GlobalVariable;
import	jp.vstone.RobotLib.*;
import	jp.vstone.sotatalk.*;
import	jp.vstone.sotatalk.SpeechRecog.*;
import	jp.vstone.camera.*;
import	java.util.*;
import	java.awt.Color;

public class mymain
{

	public String speechRecogResult;
	public RecogResult recogresult;
	public String time_string;
	public CRobotPose pose;
	public mymain()																										//@<BlockInfo>jp.vstone.block.func.constructor,112,80,432,80,False,5,@</BlockInfo>
	{
																														//@<OutputChild>
		/*String speechRecogResult*/;																					//@<BlockInfo>jp.vstone.block.variable,176,80,176,80,False,4,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*RecogResult recogresult*/;																					//@<BlockInfo>jp.vstone.block.variable,240,80,240,80,False,3,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*String time_string*/;																							//@<BlockInfo>jp.vstone.block.variable,304,80,304,80,False,2,break@</BlockInfo>
																														//@<EndOfBlock/>
		/*CRobotPose pose*/;																							//@<BlockInfo>jp.vstone.block.variable,368,80,368,80,False,1,break@</BlockInfo>
																														//@<EndOfBlock/>
																														//@</OutputChild>
	}																													//@<EndOfBlock/>

	//@<Separate/>
	public void main()																									//@<BlockInfo>jp.vstone.block.func,32,992,1808,992,False,44,コメント@</BlockInfo>
	throws SpeechRecogAbortException {
		if(!GlobalVariable.TRUE) throw new SpeechRecogAbortException("default");

																														//@<OutputChild>
		boolean loopBreakKey=false;																						//@<BlockInfo>jp.vstone.block.variable,96,992,96,992,False,43,break@</BlockInfo>
																														//@<EndOfBlock/>
		GlobalVariable.sotawish.Say((String)"ごきげんよう。僕の目が水色になったら貴方のお名前を仰って。終了するときはおわりと言ってね。",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,160,992,160,992,False,42,@</BlockInfo>
																														//@<EndOfBlock/>
		while(loopBreakKey==false)																						//@<BlockInfo>jp.vstone.block.while,224,992,1744,992,False,41,TRUE@</BlockInfo>
		{


																														//@<OutputChild>
			pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,304,992,304,992,False,40,コメント@</BlockInfo>
			pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
							new Short[]{0,-900,0,900,0,0,0,0}
							);
			pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
							new Short[]{100,100,100,100,100,100,100,100}
							);
			pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
							new Short[]{0,-255,0,180,80,0,180,80,0}
							);
			GlobalVariable.motion.play(pose,1000);
			CRobotUtil.wait(1000);																						//@<EndOfBlock/>
			pose = new CRobotPose();																					//@<BlockInfo>jp.vstone.block.pose,384,992,384,992,False,39,コメント@</BlockInfo>
			pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
							new Short[]{1,-892,-600,896,560,-1,-111,-300}
							);
			pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
							new Short[]{100,100,100,100,100,100,100,100}
							);
			pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
							new Short[]{0,-255,0,180,80,0,180,80,0}
							);
			GlobalVariable.motion.play(pose,1000);
			CRobotUtil.wait(1000);																						//@<EndOfBlock/>
			recogresult = GlobalVariable.recog.getRecognitionwithAbort((int)60000);										//@<BlockInfo>jp.vstone.block.talk.speechrecog.regex2,480,224,1744,224,False,38,音声認識を行い、結果を条件に正規表現文字列で比較する。認識スコアが一番高い結果に分岐する。実際に認識された文字列はspeechRecogResultに代入される@</BlockInfo>
			speechRecogResult = recogresult.CheckBest(new String[]{
			 ".*ヤマシタ.*" ,  ".*終わり.*" ,  ".*ソブエ.*" ,  ".*ナガタ.*" ,  ".*コマキ.*" ,  ".*フジモト.*" ,  ".*ヒグチ.*" ,  ".*シミズ.*" ,  ".*ヤマノウチ.*" ,  ".*イヨダ.*" ,  ".*イマノジカン.*" ,  ".*イワハシ.*" ,  ".*ヤマナ.*" ,  ".*オカダ.*" ,  ".*イシムラ.*" ,  ".*マツシタ.*" ,  "" , 
			},true);
			if(speechRecogResult == null) speechRecogResult = "";

			if(speechRecogResult.contains((String)".*ヤマシタ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"あっ山下さんようこそ、金券ください",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,560,224,560,224,False,6,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*終わり.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					loopBreakKey=(boolean)true;																				//@<BlockInfo>jp.vstone.block.calculater,560,320,560,320,False,8,@</BlockInfo>
																															//@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)"ばいばい、また話しかけてね",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,688,320,688,320,False,7,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*ソブエ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"こんにちは祖父江さん",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,560,416,560,416,False,9,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*ナガタ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"こんにちは永田さん",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,560,512,560,512,False,10,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*コマキ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"伊与田の世話ありがとうありがとう",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,560,608,560,608,False,11,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*フジモト.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"こんにちは大助さん、おやおや、今日は何時に帰るんですか～？",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)1,(int)15);	//@<BlockInfo>jp.vstone.block.talk.say,560,704,560,704,False,12,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*ヒグチ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"樋口さん、こんにちわ。僕を買ってくれてありがとう",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,560,800,560,800,False,13,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*シミズ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"清水さん、こんにちわ。あんまり飲み過ぎないでね！！",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,560,896,560,896,False,14,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*ヤマノウチ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"山ノ内さん、こんにちわ。…おまえ東京にいた時より太ったなあ～",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)8,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,560,992,560,992,False,15,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*イヨダ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"伊与田さん、僕達同期ですね！",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,560,1088,560,1088,False,16,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*イマノジカン.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					time_string = CRobotUtil.getTimeString();																//@<BlockInfo>jp.vstone.block.time.gettime,560,1184,560,1184,False,18,ロボット内のカレンダーより現在時刻を文字列で取得し、変数String time_stringに代入。@</BlockInfo>
																															//@<EndOfBlock/>
					GlobalVariable.sotawish.Say((String)time_string + "です",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,656,1184,656,1184,False,17,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*イワハシ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"岩橋さん、こんにちは僕のこと可愛がってね",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,560,1280,560,1280,False,19,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*ヤマナ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"山名さん、こんにちは、僕、コーラ行ける口ですよ",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,560,1376,560,1376,False,20,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*オカダ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"岡田さん、ポケモンGO--やり過ぎです!",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,560,1472,560,1472,False,21,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*イシムラ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"あっ石村さん、名古屋のグルメ、教えて下さーい",MotionAsSotaWish.MOTION_TYPE_TALK,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,560,1568,560,1568,False,22,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else if(speechRecogResult.contains((String)".*マツシタ.*"))
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"あっ、松下さん!酒と女と煙草、教えて下さいよぉ～～",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,560,1664,560,1664,False,23,@</BlockInfo>
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
			else
			{
				speechRecogResult = recogresult.getBasicResult();
				if(speechRecogResult == null) speechRecogResult = "";

																														//@<OutputChild>
					GlobalVariable.sotawish.Say((String)"あなたはだれですか。顔見せて。",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,560,1760,560,1760,False,37,@</BlockInfo>
																															//@<EndOfBlock/>
					boolean loopBreakKey2=false;																			//@<BlockInfo>jp.vstone.block.variable,624,1760,624,1760,False,36,break@</BlockInfo>
																															//@<EndOfBlock/>
					GlobalVariable.robocam.setEnableFaceSearch(false);														//@<BlockInfo>jp.vstone.block.facedetect.traking,688,1760,1648,1760,False,35,顔追従@</BlockInfo>
					GlobalVariable.robocam.setEnableSmileDetect(true);
					GlobalVariable.robocam.setEnableAgeSexDetect(true);
					
					GlobalVariable.robocam.StartFaceTraking();
					try{
						GlobalVariable.detectCount=0;
					
					
																															//@<OutputChild>
						while(loopBreakKey2==false)																			//@<BlockInfo>jp.vstone.block.while,768,1968,1552,1952,False,34,TRUE@</BlockInfo>
						{
					
					
																															//@<OutputChild>
							GlobalVariable.faceresult = GlobalVariable.robocam.getDetectResult();							//@<BlockInfo>jp.vstone.block.facedetect.isdetect,832,1920,1456,1904,False,33,コメント@</BlockInfo>
					
							if(GlobalVariable.faceresult.isDetect()) GlobalVariable.detectCount++;
							else GlobalVariable.detectCount=0;
					
							if(GlobalVariable.detectCount>(int)2)
							{
																															//@<OutputChild>
								{																							//@<BlockInfo>jp.vstone.block.facedetect.gender2,912,1760,1376,1760,False,32,@</BlockInfo>
									boolean isMale=false,isFemale=false;
									GlobalVariable.faceresult = GlobalVariable.robocam.getDetectResult();
									if(GlobalVariable.faceresult.isMale()!=null) isMale = GlobalVariable.faceresult.isMale();
									if(GlobalVariable.faceresult.isFemale()!=null) isFemale = GlobalVariable.faceresult.isFemale();
					
									if( isMale )
									{
																															//@<OutputChild>
									pose = new CRobotPose();																//@<BlockInfo>jp.vstone.block.pose,976,1760,976,1760,False,29,コメント@</BlockInfo>
									pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
													new Short[]{-7,605,312,-599,-314,-476,-69,-241}
													);
									pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
													new Short[]{100,100,100,100,100,100,100,100}
													);
									pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
													new Short[]{0,-255,0,180,80,0,180,80,0}
													);
									GlobalVariable.motion.play(pose,800);
									CRobotUtil.wait(800);																	//@<EndOfBlock/>
									pose = new CRobotPose();																//@<BlockInfo>jp.vstone.block.pose,1040,1760,1040,1760,False,28,コメント@</BlockInfo>
									pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
													new Short[]{-110,-486,-189,508,116,233,-63,230}
													);
									pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
													new Short[]{100,100,100,100,100,100,100,100}
													);
									pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
													new Short[]{0,-255,0,180,80,0,180,80,0}
													);
									GlobalVariable.motion.play(pose,800);
									CRobotUtil.wait(800);																	//@<EndOfBlock/>
									GlobalVariable.sotawish.Say((String)"男は興味ないです。女性がいいです。",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,1120,1760,1120,1760,False,27,@</BlockInfo>
																															//@<EndOfBlock/>
									pose = new CRobotPose();																//@<BlockInfo>jp.vstone.block.pose,1184,1760,1184,1760,False,26,コメント@</BlockInfo>
									pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
													new Short[]{3,-859,-439,-176,491,-1,50,-6}
													);
									pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
													new Short[]{100,100,100,100,100,100,100,100}
													);
									pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
													new Short[]{0,-255,0,180,80,0,180,80,0}
													);
									GlobalVariable.motion.play(pose,800);
									CRobotUtil.wait(800);																	//@<EndOfBlock/>
									pose = new CRobotPose();																//@<BlockInfo>jp.vstone.block.pose,1248,1760,1248,1760,False,25,コメント@</BlockInfo>
									pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
													new Short[]{3,-860,-439,-623,254,-3,-178,-8}
													);
									pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
													new Short[]{100,100,100,100,100,100,100,100}
													);
									pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
													new Short[]{0,-255,0,180,80,0,180,80,0}
													);
									GlobalVariable.motion.play(pose,900);
									CRobotUtil.wait(900);																	//@<EndOfBlock/>
									loopBreakKey2=(boolean)true;															//@<BlockInfo>jp.vstone.block.calculater,1312,1760,1312,1760,False,24,@</BlockInfo>
																															//@<EndOfBlock/>
																															//@</OutputChild>
					
									}else if( isFemale )
									{
																															//@<OutputChild>
									GlobalVariable.sotawish.Say((String)"どうも、こんにちわ。お友達になってね。",MotionAsSotaWish.MOTION_TYPE_HELLO,(int)11,(int)13,(int)11);	//@<BlockInfo>jp.vstone.block.talk.say,1168,1856,1168,1856,False,45,@</BlockInfo>
																															//@<EndOfBlock/>
									pose = new CRobotPose();																//@<BlockInfo>jp.vstone.block.pose,1232,1856,1232,1856,False,31,コメント@</BlockInfo>
									pose.SetPose(	new Byte[]{1,2,3,4,5,6,7,8},
													new Short[]{-2,350,-182,-495,202,-3,-180,272}
													);
									pose.SetTorque(	new Byte[]{1,2,3,4,5,6,7,8},
													new Short[]{100,100,100,100,100,100,100,100}
													);
									pose.SetLed(	new Byte[]{0,1,2,8,9,10,11,12,13},
													new Short[]{0,-255,0,180,80,0,180,80,0}
													);
									GlobalVariable.motion.play(pose,1000);
									CRobotUtil.wait(1000);																	//@<EndOfBlock/>
									loopBreakKey2=(boolean)true;															//@<BlockInfo>jp.vstone.block.calculater,1296,1856,1296,1856,False,30,@</BlockInfo>
																															//@<EndOfBlock/>
																															//@</OutputChild>
					
									}else
									{
																															//@<OutputChild>
																															//@</OutputChild>
					
									}
								}
																															//@<EndOfBlock/>
																															//@</OutputChild>
					
							}else
							{
																															//@<OutputChild>
																															//@</OutputChild>
					
							}
																															//@<EndOfBlock/>
																															//@</OutputChild>
						}
																															//@<EndOfBlock/>
																															//@</OutputChild>
					
					
					}finally{
						GlobalVariable.robocam.StopFaceTraking();
					}
																															//@<EndOfBlock/>
																																//@</OutputChild>

			}
																														//@<EndOfBlock/>
																														//@</OutputChild>
		}
																														//@<EndOfBlock/>
																														//@</OutputChild>

	}																													//@<EndOfBlock/>

}
