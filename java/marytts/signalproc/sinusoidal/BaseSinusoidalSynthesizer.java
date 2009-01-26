/**
 * Copyright 2007 DFKI GmbH.
 * All Rights Reserved.  Use is subject to license terms.
 *
 * This file is part of MARY TTS.
 *
 * MARY TTS is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */
package marytts.signalproc.sinusoidal;

/**
 * @author Oytun Tu&umlrk
 * 
 * Base class for sinusoidal synthesizers
 *
 */
public class BaseSinusoidalSynthesizer {
    
    public int fs; //Sampling rate in Hz
    public static float DEFAULT_ABS_MAX_OUT = 0.90f;
    
    public static final int PEAK_MATCHED_TRACK_SYNTHESIZER = 1; //This uses the tracks generated by the peak matching track generation algorithm in Quatieri´s book
    public static final int OVERLAP_ADD_SYNTHESIZER = 2; //This uses overlap-add algorithm to generate and concatenate sinusoidal frames
    
    public BaseSinusoidalSynthesizer(int samplingRate)
    {
        fs = samplingRate;
    }
}
