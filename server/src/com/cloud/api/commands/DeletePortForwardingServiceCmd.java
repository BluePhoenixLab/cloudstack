/**
 *  Copyright (C) 2010 Cloud.com, Inc.  All rights reserved.
 * 
 * This software is licensed under the GNU General Public License v3 or later.
 * 
 * It is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or any later version.
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package com.cloud.api.commands;

import org.apache.log4j.Logger;

import com.cloud.api.BaseCmd;
import com.cloud.api.Implementation;
import com.cloud.api.Parameter;
import com.cloud.api.BaseCmd.Manager;

@Implementation(method="deleteSecurityGroup", manager=Manager.ManagementServer)
public class DeletePortForwardingServiceCmd extends BaseCmd {
    public static final Logger s_logger = Logger.getLogger(DeletePortForwardingServiceCmd.class.getName());
    private static final String s_name = "deleteportforwardingserviceresponse";

    /////////////////////////////////////////////////////
    //////////////// API parameters /////////////////////
    /////////////////////////////////////////////////////

    @Parameter(name="id", type=CommandType.LONG, required=true)
    private Long id;


    /////////////////////////////////////////////////////
    /////////////////// Accessors ///////////////////////
    /////////////////////////////////////////////////////

    public Long getId() {
        return id;
    }

    /////////////////////////////////////////////////////
    /////////////// API Implementation///////////////////
    /////////////////////////////////////////////////////

    public String getName() {
        return s_name;
    }
//    @Override
//    public List<Pair<String, Object>> execute(Map<String, Object> params) {
//        Long userId = (Long)params.get(BaseCmd.Properties.USER_ID.getName());
//        Account account = (Account)params.get(BaseCmd.Properties.ACCOUNT_OBJ.getName());
//        Long id = (Long)params.get(BaseCmd.Properties.ID.getName());
//
//        if (userId == null) {
//            userId = Long.valueOf(User.UID_SYSTEM);
//        }
//
//        //verify parameters
//        SecurityGroupVO sg = getManagementServer().findSecurityGroupById(id.longValue());
//        if (sg == null) {
//        	throw new ServerApiException(BaseCmd.PARAM_ERROR, "unable to find port forwarding service with id " + id);
//        }
//
//        if (account != null) {
//            if (!isAdmin(account.getType())) {
//                if (account.getId().longValue() != sg.getAccountId()) {
//                    throw new ServerApiException(BaseCmd.ACCOUNT_ERROR, "unable to find a port forwarding service with id " + id + " for this account");
//                }
//            } else if (!getManagementServer().isChildDomain(account.getDomainId(), sg.getDomainId())) {
//                throw new ServerApiException(BaseCmd.ACCOUNT_ERROR, "Unable to delete port forwarding service " + id + ", permission denied.");
//            }
//        }
//
//        long jobId = getManagementServer().deleteSecurityGroupAsync(userId.longValue(), sg.getAccountId(), id.longValue());
//
//        List<Pair<String, Object>> returnValues = new ArrayList<Pair<String, Object>>();
//        returnValues.add(new Pair<String, Object>(BaseCmd.Properties.JOB_ID.getName(), Long.valueOf(jobId).toString()));
//        return returnValues;
//    }
    
	@Override
	public String getResponse() {
		// TODO Auto-generated method stub
		return null;
	}
}
